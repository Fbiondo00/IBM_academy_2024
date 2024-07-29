package com.sistemi.informativi.service;

import com.sistemi.informativi.document.Course;
import com.sistemi.informativi.document.Review;

import java.util.List;

public interface CourseService {

    public Course saveCourse(Course course);

    public List<Course> getAllCoure();

    public List<Review> getReviewsByCourse(String code) throws Exception;
}
