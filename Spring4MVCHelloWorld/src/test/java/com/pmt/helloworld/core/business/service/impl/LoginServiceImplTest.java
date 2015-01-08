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

package com.pmt.helloworld.core.business.service.impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.pmt.helloworld.SpringTest;
import com.pmt.helloworld.core.business.service.LoginService;

/**
 * @author Billy
 * (功能描述可寫於此)
 */
public class LoginServiceImplTest extends SpringTest{
    
    @Autowired
    LoginService dao;
    
    @Test
    public void testLoginDaoImpl() {
        showPojoContent(dao.getEmployeeInfoByUserName("Billy"));
    }

    @Test
    public void testGetEmployeeInfoById() {
        showPojoContent(dao.getGmailInfoByUserName("billy.shih@promeritage.com.tw"));
    }

}