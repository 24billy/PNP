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

package com.pmt.helloworld.core.vo;

/**
 * @author Billy
 * 人員資料封裝物件
 */
public class EmployeeVO {

    private String empNo; //員工編號 
    private String empName; //員工中文姓名
    private String engName; //員工英文姓名
    private String titleName; //職稱外顯中文
    private String endDate;  //到職日
    private String offDate;  //離職日
    private String sex;  //性別
    private String mobile;  //手機
    private String email;  //Email
    private Integer seniority;  //年資
    private String deptCode;  //部門代號
    private String shiftId;  //班別唯一識別碼
      
    public String getEmpNo() {
        return empNo;
    }
    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public String getEngName() {
        return engName;
    }
    public void setEngName(String engName) {
        this.engName = engName;
    }
    public String getTitleName() {
        return titleName;
    }
    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }
    public String getEndDate() {
        return endDate;
    }
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    public String getOffDate() {
        return offDate;
    }
    public void setOffDate(String offDate) {
        this.offDate = offDate;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getSeniority() {
        return seniority;
    }
    public void setSeniority(Integer seniority) {
        this.seniority = seniority;
    }
    public String getDeptCode() {
        return deptCode;
    }
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }
    public String getShiftId() {
        return shiftId;
    }
    public void setShiftId(String shiftId) {
        this.shiftId = shiftId;
    }
    
    @Override
    public String toString() {
        return "EmployeeVO [empNo=" + empNo + ", empName=" + empName
                + ", engName=" + engName + ", titleName=" + titleName
                + ", endDate=" + endDate + ", offDate=" + offDate + ", sex="
                + sex + ", mobile=" + mobile + ", email=" + email
                + ", seniority=" + seniority + ", deptCode=" + deptCode
                + ", shiftId=" + shiftId + "]";
    }
    
}
