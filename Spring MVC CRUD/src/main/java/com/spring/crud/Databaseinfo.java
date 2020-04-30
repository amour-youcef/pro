package com.spring.crud;

import org.springframework.jdbc.core.JdbcTemplate; 

public class Databaseinfo {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}  
	
}
