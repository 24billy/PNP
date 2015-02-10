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

package com.pmt.helloworld.core.business.service;

import java.util.List;
import java.util.Map;

import com.pmt.helloworld.core.vo.EmployeeVO;

/**
 * @author Billy
 * [員工] 服務
 */
public interface IEmpService {
    
    /**
     * 取得員工資訊
     * @param name
     * @return
     *  EmployeeVO
     */
    EmployeeVO getEmployeeInfoByUserName(String name);
    
    /**
     * 取得特休資料
     * @param empNo
     * @return
     *   List<Map<String, Object>>
     */
    List<Map<String, Object>> getRestDays(String empNo);
    
}
