package com.springboot.jpaandhibernate.jdbc.course.jpa;

import org.springframework.stereotype.Repository;

import com.springboot.jpaandhibernate.jdbc.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class JPARepository {

	@PersistenceContext
	private EntityManager entityManager;

	public void insert(Course course) {
		entityManager.merge(course);
	}
}
