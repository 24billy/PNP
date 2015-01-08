/**
 * Copyright (c) 2014 Far Eastone Telecommunications Co., Ltd.
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of 
 * Far Eastone Telecommunications Co., Ltd. ("Confidential Information"). 
 * 
 * You shall not disclose such Confidential Information and shall use it 
 * only in accordance with the terms of license agreement you entered
 * into with Far Eastone Telecommunications Co., Ltd.
 */

package com.pmt.helloworld;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.pmt.helloworld.core.db.config.DataSourceConfig;

/**
 * 
 * @author Billy
 */
@RunWith(SpringJUnit4ClassRunner.class)
//指定Spring使用的dataSource and Dao
@ContextConfiguration(classes = DataSourceConfig.class)
@Transactional
@WebAppConfiguration    
public class SpringTest extends AbstractTest {

}
