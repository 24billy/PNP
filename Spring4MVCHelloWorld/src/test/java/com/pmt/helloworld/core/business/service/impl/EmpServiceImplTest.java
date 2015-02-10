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
import com.pmt.helloworld.core.business.service.IEmpService;

/**
 * @author Billy
 * [員工] 相關服務單元測試
 */
public class EmpServiceImplTest extends SpringTest{
    
    @Autowired
    IEmpService service;
    
    @Test
    public void testLoginDaoImpl() {
        showPojoContent(service.getEmployeeInfoByUserName("Billy"));
    }
    
    @Test
    public void testGetRestDays() {
        showDataList(service.getRestDays("1"));
    }

}