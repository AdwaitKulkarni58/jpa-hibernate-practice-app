// This class is responsible for connecting and running the database every time the application starts

package com.springboot.jpaandhibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JdbcCommandLineRunner implements CommandLineRunner {

	@Autowired
	private JdbcRepository repository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

	}

}
