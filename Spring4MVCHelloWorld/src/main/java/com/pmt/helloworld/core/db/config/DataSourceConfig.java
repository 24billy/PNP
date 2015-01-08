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
 
package com.pmt.helloworld.core.db.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
 
/**
 *
 * @author LawrenceLai
 */
@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages="com.pmt.helloworld.core")
public class DataSourceConfig {
	
	@Autowired
	private Environment environment;

	@Bean(name="dataSource")
	public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/PmtDB");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres");
         
        return dataSource;
	}
	
}
