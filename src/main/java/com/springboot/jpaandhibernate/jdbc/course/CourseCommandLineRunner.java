// This class is responsible for connecting and running the database every time the application starts

package com.springboot.jpaandhibernate.jdbc.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.jpaandhibernate.jdbc.course.jdbc.JdbcRepository;
import com.springboot.jpaandhibernate.jdbc.course.jpa.JPARepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

	@Autowired
	private JdbcRepository repository;

	@Autowired
	private JPARepository jpaRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

	}

}
