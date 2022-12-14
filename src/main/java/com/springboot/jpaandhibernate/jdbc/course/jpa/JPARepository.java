// This class is responsible for talking to the database using JPA

package com.springboot.jpaandhibernate.jdbc.course.jpa;

import org.springframework.stereotype.Repository;

import com.springboot.jpaandhibernate.jdbc.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class JPARepository {

	@PersistenceContext
	private EntityManager entityManager;

	public void insert(Course course) {
		entityManager.merge(course);
	}

	public void deleteById(long id) {
		Course course = entityManager.find(Course.class, id);
		entityManager.remove(course);
	}

	public Course findById(long id) {
		return entityManager.find(Course.class, id);
	}
}
