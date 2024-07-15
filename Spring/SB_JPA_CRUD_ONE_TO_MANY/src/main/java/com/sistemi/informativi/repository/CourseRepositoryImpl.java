package com.sistemi.informativi.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sistemi.informativi.entity.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Transactional
@Repository
public class CourseRepositoryImpl implements CourseRepository{
	
	// JAVA EE
	@PersistenceContext
	private EntityManager em;

	@Override
	public void addCourse(Course course) {
		
		em.persist(course);
		
	}

	@Override
	public void removeCourse(int id) {
		
		em.remove(em.find(Course.class, id));
		
		
	}

}
