package com.sistemi.informativi.service;

import com.sistemi.informativi.entity.Review;

public interface ReviewService {
	
	public void checkAddReview(Review review);
	
	public void checkReviewsByCourse(int courseId);

}
