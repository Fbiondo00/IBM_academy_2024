package com.sistemi.informativi.facade;

import com.sistemi.informativi.entity.Course;
import com.sistemi.informativi.entity.Review;

public interface FacadeService {
	
	public void addCourse(Course course);
	
	public void removeCourse(int id);
	
	public void addReview(Review review);
	
	public void getReviewsByCourse(int courseId);

}
