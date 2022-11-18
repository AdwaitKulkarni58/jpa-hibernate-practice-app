// This class is responsible for talking to the database

package com.springboot.jpaandhibernate.jdbc.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.jpaandhibernate.jdbc.course.Course;

@Repository
public class JdbcRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static String INSERT_QUERY = """
			INSERT INTO COURSE(ID, NAME, AUTHOR)
			VALUES(?, ?, ?)
			""";

	private static String DELETE_QUERY = """
			DELETE FROM COURSE
			WHERE ID = ?
			""";

	private static String SELECT_QUERY = """
			SELECT * FROM COURSE
			WHERE ID = ?
			""";

	public void insert(Course course) {
		jdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
	}

	public void deleteById(long id) {
		jdbcTemplate.update(DELETE_QUERY, id);
	}

	public Course selectById(long id) {
		return jdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
	}

}