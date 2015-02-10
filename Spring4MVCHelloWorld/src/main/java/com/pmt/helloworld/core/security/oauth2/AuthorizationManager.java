/**
 * Copyright (c) 2014 Pro Meritage Inte'l Co., Ltd.
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of 
 * Pro Meritage Inte'l Co., Ltd. ("Confidential Information"). 
 * 
 * You shall not disclose such Confidential Information and shall use it 
 * only in accordance with the terms of license agreement you entered
 * into with Pro Meritage Inte'l Co., Ltd.
 */

package com.pmt.helloworld.core.security.oauth2;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.DataStoreFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.oauth2.Oauth2;
import com.google.api.services.oauth2.model.Tokeninfo;
import com.google.api.services.oauth2.model.Userinfoplus;

/**
 * Oauth2 憑證管理器
 * @author Billy
 */
public class AuthorizationManager {

    private static final String APPLICATION_NAME = "PMTHelloWorld";
    
    /** Directory to store user credentials. */
    private static final java.io.File DATA_STORE_DIR =
        new java.io.File(System.getProperty("user.home"), ".store/oauth2_sample");
    
    /**
     * Global instance of the {@link DataStoreFactory}. The best practice is to make it a single
     * globally shared instance across your application.
     */
    private static FileDataStoreFactory dataStoreFactory;

    /** Global instance of the HTTP transport. */
    private static HttpTransport httpTransport;
    
    /** Global instance of the JSON factory. */
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();

    /** OAuth 2.0 scopes. */
    private static final List<String> SCOPES = Arrays.asList(
        "https://www.googleapis.com/auth/userinfo.profile",
        "https://www.googleapis.com/auth/userinfo.email");
    
    private static Oauth2 oauth2;
    private static GoogleClientSecrets clientSecrets;
    private static Map<String, String> resultMap;
    
    /**
     * 取得GoogleOauth2認證
     * 
     * @return Map<String, String>
     */
    
    public static Map<String, String> getAuth(){
        resultMap = new HashMap<String, String>();
        
        try {
            // 產生一個Transport實體  
            httpTransport = GoogleNetHttpTransport.newTrustedTransport();
            // 檔案存放位置
            dataStoreFactory = new FileDataStoreFactory(DATA_STORE_DIR);
            
            // authorization(開始Google驗證)
            Credential credential = authorize();
            
            // 取得Oauth2結果
            header("set Oauth2");
            oauth2 = new Oauth2.Builder(httpTransport, JSON_FACTORY, credential).setApplicationName(
                APPLICATION_NAME).build();
            resultMap.put("token", credential.getAccessToken());

            // run commands
            tokenInfo(credential.getAccessToken());
            userInfo();
            
            return resultMap;
          } catch (IOException e) {
            System.err.println(e.getMessage());
          } catch (Throwable t) {
            t.printStackTrace();
          }
        
        return resultMap;
    }
    
    /** Authorizes the installed application to access user's protected data. */
    private static Credential authorize() throws Exception {
      header("start authorize");
      //  取得client-secret內的資訊
      clientSecrets = GoogleClientSecrets.load(JSON_FACTORY,
          new InputStreamReader(AuthorizationManager.class.getResourceAsStream("/client_secrets.json")));
      
      // 設定認證碼
      GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
          httpTransport, JSON_FACTORY, clientSecrets, SCOPES).setDataStoreFactory(
          dataStoreFactory).build();
      
      // authorize
      LocalServerReceiver receiver = new LocalServerReceiver();
      System.out.println("LocalServerReceiver : " + receiver);

      // 需等待google回傳才得到認證
      Credential credential = new AuthorizationCodeInstalledApp(flow, receiver).authorize("user");
      System.out.println("credential : " + credential);
      System.out.println("Token : " + credential.getAccessToken());
      
      return credential;
    }
 
    private static void tokenInfo(String accessToken) throws IOException {
        header("Validating a token");
        
        Tokeninfo tokeninfo = oauth2.tokeninfo().setAccessToken(accessToken).execute();
        
        System.out.println(tokeninfo.toPrettyString());
        
        if (!tokeninfo.getAudience().equals(clientSecrets.getDetails().getClientId())) {
          System.err.println("ERROR: audience does not match our client ID!");
        }
      }

    private static void userInfo() throws IOException {
        header("Obtaining User Profile Information");
        Userinfoplus userinfo = oauth2.userinfo().get().execute();
        
        resultMap.put("hd", userinfo.getHd());
        resultMap.put("givenName", userinfo.getGivenName());
        
        System.out.println(userinfo.toPrettyString());
    }
    
    private static void header(String name) {
        System.out.println();
        System.out.println("================== " + name + " ==================");
        System.out.println();
    }
    
    /**
     * 刪除儲存在本機的憑證
     */
    public static void removeStoredCredential() {
        String fileDirectory = dataStoreFactory.getDataDirectory().getAbsolutePath();
        String fileName = "StoredCredential";
        File file = new File(fileDirectory + "/" + fileName);
        
        file.delete();
    }
    
}