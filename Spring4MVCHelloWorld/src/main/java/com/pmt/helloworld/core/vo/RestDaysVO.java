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
 * 特休檔封裝物件
 */
public class RestDaysVO {
    
    String empNo; //員工編號
    String year; //年度(西元)
    Double AnnualLeave; //核定特休時數
    Double compTime;  //補休時數
    Double extendAnnualLeave;  //延展時數
    Double restAnnualLeave;  //已休時數_特休
    Double restCompTime;  //已休時數_補休
    String borrow;  //借用
    
    public String getEmpNo() {
        return empNo;
    }
    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public Double getAnnualLeave() {
        return AnnualLeave;
    }
    public void setAnnualLeave(Double annualLeave) {
        AnnualLeave = annualLeave;
    }
    public Double getCompTime() {
        return compTime;
    }
    public void setCompTime(Double compTime) {
        this.compTime = compTime;
    }
    public Double getExtendAnnualLeave() {
        return extendAnnualLeave;
    }
    public void setExtendAnnualLeave(Double extendAnnualLeave) {
        this.extendAnnualLeave = extendAnnualLeave;
    }
    public Double getRestAnnualLeave() {
        return restAnnualLeave;
    }
    public void setRestAnnualLeave(Double restAnnualLeave) {
        this.restAnnualLeave = restAnnualLeave;
    }
    public Double getRestCompTime() {
        return restCompTime;
    }
    public void setRestCompTime(Double restCompTime) {
        this.restCompTime = restCompTime;
    }
    public String getBorrow() {
        return borrow;
    }
    public void setBorrow(String borrow) {
        this.borrow = borrow;
    }
    
    @Override
    public String toString() {
        return "RestDaysVO [empNo=" + empNo + ", year=" + year
                + ", AnnualLeave=" + AnnualLeave + ", compTime=" + compTime
                + ", extendAnnualLeave=" + extendAnnualLeave
                + ", restAnnualLeave=" + restAnnualLeave + ", restCompTime="
                + restCompTime + ", borrow=" + borrow + "]";
    }
    
}