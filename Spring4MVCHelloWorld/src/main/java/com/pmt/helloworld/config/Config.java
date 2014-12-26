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

package com.pmt.helloworld.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 * 
 * @author Billy
 * replace  dispatcher-servlet.xml
 */
@Configuration
// Marks this class as configuration
// Specifies which package to scan
@ComponentScan("com.pmt.helloworld.controller")
// Enables Spring's annotations
@EnableWebMvc
public class Config extends WebMvcConfigurerAdapter{  
    
    /**
     * The caveat of mapping DispatcherServlet to “/” is that by default 
     * it breaks the ability to serve static resources like images and CSS files.
     * To remedy this, I need to configure Spring MVC to enable defaultServletHandling.
     * 
     * http://zeroturnaround.com/rebellabs/your-next-java-web-app-less-xml-no-long-restarts-fewer-hassles-part-1/ 
     */
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
    
    @Bean
    public UrlBasedViewResolver setupViewResolver() {
        UrlBasedViewResolver resolver = new UrlBasedViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        
        return resolver;
    }
    
}
