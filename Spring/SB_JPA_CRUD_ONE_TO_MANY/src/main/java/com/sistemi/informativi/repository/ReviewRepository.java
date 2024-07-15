package com.sistemi.informativi.repository;

import java.util.List;

import com.sistemi.informativi.entity.Review;

public interface ReviewRepository {
	
	public void addReview(Review review);
	
	public List<Review> getReviewsByCourse(int courseId);

}
