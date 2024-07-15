package com.sistemi.informativi.facade;

import org.springframework.stereotype.Service;

import com.sistemi.informativi.entity.Course;
import com.sistemi.informativi.entity.Review;
import com.sistemi.informativi.service.CourseService;
import com.sistemi.informativi.service.ReviewService;

@Service
public class FacadeServiceImpl implements FacadeService{
	
	
	private CourseService courseService;
	private ReviewService reviewService;
	
	public FacadeServiceImpl(CourseService courseService, ReviewService reviewService) {
		
		this.courseService = courseService;
		this.reviewService = reviewService;
	}

	@Override
	public void addCourse(Course course) {
		
		courseService.checkAddCourse(course);
		
	}

	@Override
	public void removeCourse(int id) {
	
		courseService.checkRemoveCourse(id);
		
	}

	@Override
	public void addReview(Review review) {
		
		reviewService.checkAddReview(review);
		
	}

	@Override
	public void getReviewsByCourse(int courseId) {
		
		reviewService.checkReviewsByCourse(courseId);
		
	}

}
