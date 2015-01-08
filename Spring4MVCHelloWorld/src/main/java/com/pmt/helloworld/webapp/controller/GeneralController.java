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

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Billy
 * 通導頁控制器
 */
@Controller
public class GeneralController {

    @RequestMapping("/home")
    public String home(Model model) {
        return "redirect:/"; // 頁面導向 /WEB-INF/views/ 搜索檔案類型.jsp
    }

    @RequestMapping("/outWebSite")
    public String outWebSite(
            @RequestParam(value = "webSite", required = false) String webSite,
            Model model) {
        return "redirect:" + webSite; // 頁面導向 /WEB-INF/views/ 搜索檔案類型.jsp
    }
    
}