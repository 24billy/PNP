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

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.pmt.helloworld.core.business.service.ILeaveService;
import com.pmt.helloworld.core.db.jdbc.JdbcDAO;

/**
 * @author Billy
 * [休假] 服務實作
 */
@Service
public class LeaveTrackImpl implements ILeaveService {

    @Autowired
    @Qualifier("jdbcDAO")
    private JdbcDAO jdbcDAO;
    
    @Override
    public List<Map<String, Object>> getLeaveTrack(String empNo) {
        String sqltext = "SELECT * FROM EMPLOYEE WHERE engname = '$P{engName}'";
        
        return null;
    }

    @Override
    public void updateLeaveTrack() {
        
    }

    @Override
    public List<Map<String, Object>> getRestDays(String empNo) {
        String sqltext = "SELECT * FROM RestDays WHERE EmpNo = '$P{EmpNo}'";
        sqltext.replace("$P{EmpNo}", empNo);
        
        return jdbcDAO.queryForList(sqltext);
    }

    @Override
    public void updateRestDays() {
        
    }

}
