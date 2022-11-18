// This class is responsible for talking to the database

package com.springboot.jpaandhibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

}