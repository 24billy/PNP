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

import org.junit.Test;

import com.google.api.client.util.store.FileDataStoreFactory;
import com.pmt.helloworld.BasicTest;

/**
 * [測試] 憑證管理器測試檔
 * 
 * @author Billy
 * 
 */
public class AuthorizationManagerTest extends BasicTest {
    
    @Test
    public void testGetAuth() {
        AuthorizationManager.getAuth();
    }

    @Test
    public void testRemoveStoredCredential() {
        FileDataStoreFactory dataStoreFactory = null;
        String fileDirectory = null;
        String fileName = "StoredCredential";
        
        java.io.File DATA_STORE_DIR =
                new java.io.File(System.getProperty("user.home"), ".store/oauth2_sample");
        
        try {
            dataStoreFactory = new FileDataStoreFactory(DATA_STORE_DIR);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        fileDirectory = dataStoreFactory.getDataDirectory().getAbsolutePath();
        System.out.println("delete file : " + fileDirectory + "/" + fileName);
        
        File file = new File(fileDirectory + "/" + fileName);
        file.delete();
    }

}