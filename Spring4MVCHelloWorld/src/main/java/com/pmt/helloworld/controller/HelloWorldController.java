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

package com.pmt.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 
 * @author Billy
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/hello")  // 作用等同<url-pattern>
    public String hello(
            @RequestParam(value = "name", required = false, defaultValue = "World") String name,
            Model model) 
    {
        model.addAttribute("name", name);

        return "helloworld";    // 頁面導向 /WEB-INF/views/  搜索檔案類型.jsp
    }
    
    @RequestMapping("/helloBilly")
    public String helloBilly(Model model) {
        model.addAttribute("name", "Billy");
        return "helloworld";
    }
    
    @RequestMapping("/helloRita")
    public String helloRita(Model model) {
        model.addAttribute("name", "Rita");
        return "helloworld";
    }
    
    @RequestMapping("/helloLawrence")
    public String helloLawrence(Model model) {
        model.addAttribute("name", "Lawrence");
        return "helloworld";
    }

}