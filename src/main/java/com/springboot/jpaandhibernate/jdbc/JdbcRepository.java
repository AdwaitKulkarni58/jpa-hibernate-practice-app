// This class is responsible for talking to the database

package com.springboot.jpaandhibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.jpaandhibernate.jdbc.course.Course;

@Repository
public class JdbcRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static String QUERY = """
			INSERT INTO COURSE(ID, NAME, AUTHOR)
			VALUES(?, ?, ?)
			""";

	public void insert(Course course) {
		jdbcTemplate.update(QUERY, course.getId(), course.getName(), course.getAuthor());
	}

}