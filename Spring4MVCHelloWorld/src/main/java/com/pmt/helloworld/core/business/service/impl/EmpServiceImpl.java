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

import com.pmt.helloworld.core.business.service.IEmpService;
import com.pmt.helloworld.core.db.jdbc.JdbcDAO;
import com.pmt.helloworld.core.vo.EmployeeVO;

/**
 * @author Billy
 * [員工] 相關服務
 */
@Service("empDao")
public class EmpServiceImpl implements IEmpService {

    @Autowired
    @Qualifier("jdbcDAO")
    private JdbcDAO jdbcDAO;
    
    @Override
    public EmployeeVO getEmployeeInfoByUserName(String name) {
        if (name != null) {
            String sqltext = "SELECT * FROM EMPLOYEE WHERE engname = '$P{engName}'";
            sqltext = sqltext.replace("$P{engName}", name);
            
            List<Map<String, Object>> dataList = jdbcDAO.queryForList(sqltext);
            
            if (dataList != null && dataList.size() != 0) {
                Map<String, Object> dataMap = dataList.get(0);
                String empNo = (String) dataMap.get("empno");
                String empName = (String) dataMap.get("empname");
                String engName = (String) dataMap.get("engname");
                String titleName = (String) dataMap.get("titlename");
                String endDate = (String) dataMap.get("enddate");
                String offDate = (String) dataMap.get("offdate");
                String sex = (String) dataMap.get("sex");
                String mobile = (String) dataMap.get("mobile");
                String email = (String) dataMap.get("email");
                Integer seniority = (Integer) dataMap.get("seniority");
                String deptCode = (String) dataMap.get("deptcode");
                String shiftId = (String) dataMap.get("shift_id");

                EmployeeVO emp = new EmployeeVO();
                emp.setEmpNo(empNo);
                emp.setEmpName(empName);
                emp.setEngName(engName);
                emp.setTitleName(titleName);
                emp.setEndDate(endDate);
                emp.setOffDate(offDate);
                emp.setSex(sex);
                emp.setMobile(mobile);
                emp.setEmail(email);
                emp.setSeniority(seniority);
                emp.setDeptCode(deptCode);
                emp.setShiftId(shiftId);
                
                return emp;
            }
        }
        
        return null;
    }

    @Override
    public List<Map<String, Object>> getRestDays(String empNo) {
        if (empNo != null) {
            String sqltext = "SELECT * FROM RESTDAYS WHERE empno = '$P{empNo}'";
            sqltext = sqltext.replace("$P{empNo}", empNo);
                
                return jdbcDAO.queryForList(sqltext);
        }
        
        return null;
    }
    
}
