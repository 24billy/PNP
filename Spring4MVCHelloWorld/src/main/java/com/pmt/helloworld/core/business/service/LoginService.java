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

import com.pmt.helloworld.core.vo.EmployeeVO;
import com.pmt.helloworld.core.vo.GmailVO;

/**
 * @author Billy
 * [登入] 服務
 */
public interface LoginService {
    
    /**
     * 取得員工資訊
     * @param userName
     * @return
     *  EmployeeVO
     */
    EmployeeVO getEmployeeInfoByUserName(String userName);
    
    /**
     * 取得Gmail密碼
     * @param email
     * @return
     *  GmailVO
     */
    GmailVO getGmailInfoByUserName(String email);
    
}
