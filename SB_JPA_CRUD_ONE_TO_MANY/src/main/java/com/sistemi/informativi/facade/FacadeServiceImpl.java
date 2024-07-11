package com.sistemi.informativi.facade;


import com.sistemi.informativi.entity.Course;
import com.sistemi.informativi.entity.Review;
import com.sistemi.informativi.service.CourseService;
import com.sistemi.informativi.service.ReviewService;
import org.springframework.stereotype.Service;

@Service
public class FacadeServiceImpl implements FacedeService {

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
    public void addReview(Review review) {

        reviewService.checkAddReview(review);

    }

    @Override
    public void deleteCourse(int id) {

        courseService.checkRemoveCourse(id);

    }

    @Override
    public void getReviewbyCourse(int id) {

        reviewService.checkReviewByCourse(id);

    }
}