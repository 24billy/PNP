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

package com.pmt.helloworld.webapp.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pmt.helloworld.core.business.service.IEmpService;
import com.pmt.helloworld.core.security.oauth2.AuthorizationManager;
import com.pmt.helloworld.core.vo.EmployeeVO;

/**
 * @author Billy
 * [登入] 導頁控制器
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private IEmpService empService;
    
    @RequestMapping("/login")
    public String login(
            @RequestParam(value = "userName", required = false, defaultValue = "Billy") String userName,
            @RequestParam(value = "password", required = false, defaultValue = "1qaz2wsx") String password,
            Model model, HttpServletRequest request) {
        EmployeeVO emp = new EmployeeVO();
        String email = "";
        emp = empService.getEmployeeInfoByUserName(userName);
        
        if(emp!=null){
             email = emp.getEmail();
        }
        
        if(email != ""){
            if(email.equals("billy.shih@promeritage.com.tw")){
                model.addAttribute("result","登入成功");
                request.getSession().setAttribute("userName",userName);
                request.getSession().setAttribute("isLogin",true);
            }
        }
        else {
            model.addAttribute("result","登入失敗");
        }
        
        return "login";
    }
    
    @RequestMapping("/logout")
    public String logout(HttpServletRequest request) {
        request.getSession().removeAttribute("userName");
        request.getSession().removeAttribute("isLogin");
        
        AuthorizationManager.removeStoredCredential();;
        
        return "redirect:/home";
    }
    
    @RequestMapping("/loginByGoogle")
    public String loginByGoogle(Model model, HttpServletRequest request) {
        Map<String, String> resultMap = new HashMap<String, String>();
        
        // 透過Oauth取得Google的相關資訊
        try {
            resultMap = AuthorizationManager.getAuth();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        String hd = resultMap.get("hd"); //取得email資訊
        String name = resultMap.get("givenName");  //取得使用者名稱
        
        //validate
        if ("promeritage.com.tw".equals(hd)) {
            request.getSession().setAttribute("userName", name);
            request.getSession().setAttribute("isLogin", true);
            model.addAttribute("result","登入成功");
        } else {
            AuthorizationManager.removeStoredCredential();
            request.getSession().removeAttribute("userName");
            request.getSession().setAttribute("isLogin", false);
            model.addAttribute("result","登入失敗");
        }
        
        return "login";
    }
    
}