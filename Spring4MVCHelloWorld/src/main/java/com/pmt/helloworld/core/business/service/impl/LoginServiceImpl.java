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

import com.pmt.helloworld.core.business.service.LoginService;
import com.pmt.helloworld.core.db.jdbc.JdbcDAO;
import com.pmt.helloworld.core.vo.EmployeeVO;
import com.pmt.helloworld.core.vo.GmailVO;

/**
 * @author Billy
 * 
 */
@Service("loginDao")
public class LoginServiceImpl implements LoginService {

    @Autowired
    @Qualifier("jdbcDAO")
    private JdbcDAO jdbcDAO;
    
    @Override
    public EmployeeVO getEmployeeInfoByUserName(String userName) {
        if (userName != null) {
            String sqltext = "SELECT * FROM EMPLOYEE WHERE name = '$P{name}'";
            sqltext = sqltext.replace("$P{name}", userName);
            
            List<Map<String, Object>> dataList = jdbcDAO.queryForList(sqltext);
            
            if (dataList != null && dataList.size() != 0) {
                Map<String, Object> dataMap = dataList.get(0);
                String name = (String) dataMap.get("name");
                String tel = (String) dataMap.get("tel");
                String title = (String) dataMap.get("title");
                String location = (String) dataMap.get("location");
                String email = (String) dataMap.get("email");

                EmployeeVO emp = new EmployeeVO();
                emp.setName(name);
                emp.setTel(tel);
                emp.setTitle(title);
                emp.setLocation(location);
                emp.setEmail(email);

                return emp;
            }
        }
        
        return null;
    }

    @Override
    public GmailVO getGmailInfoByUserName(String email) {
        if (email != null) {
            String sqltext = "SELECT password FROM GMAIL WHERE username = '$P{email}'";
            sqltext = sqltext.replace("$P{email}", email);
            
            List<Map<String, Object>> dataList = jdbcDAO.queryForList(sqltext);
            
            if (dataList != null && dataList.size() != 0) {
                String password = (String) dataList.get(0).get("password");

                GmailVO gmailVO = new GmailVO();
                gmailVO.setUserName(email);
                gmailVO.setPassword(password);
        
                return gmailVO;
            }
        }
        
        return null;
    }
    
}
