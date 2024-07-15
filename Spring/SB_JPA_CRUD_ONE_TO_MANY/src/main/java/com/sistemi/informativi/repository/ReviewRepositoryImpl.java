package com.sistemi.informativi.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sistemi.informativi.entity.Course;
import com.sistemi.informativi.entity.Review;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Transactional
@Repository
public class ReviewRepositoryImpl implements ReviewRepository{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void addReview(Review review) {
		
		em.persist(review);
		
	}

	@Override
	public List<Review> getReviewsByCourse(int courseId) {


		Course course = em.find(Course.class, courseId);
		
		/*
		 * Hibernate eseguirà una 
		 * query di join
		 */
		return course.getReviews();
		
	}

}
