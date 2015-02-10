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

/**
 * @author Billy
 * [休假] 服務
 */
public interface ILeaveService {
    
    /**
     * 取得請假紀錄
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> getLeaveTrack(String empNo);
    
    /**
     * 更新請假紀錄
     */
    void updateLeaveTrack();
    
    /**
     * 取得特休檔
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> getRestDays(String empNo);
    
    /**
     * 更新特休檔
     */
    void updateRestDays();
    
}
