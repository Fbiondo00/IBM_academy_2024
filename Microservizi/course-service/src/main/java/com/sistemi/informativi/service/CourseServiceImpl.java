package com.sistemi.informativi.service;


import com.sistemi.informativi.document.Course;
import com.sistemi.informativi.document.Review;
import com.sistemi.informativi.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    private CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public List<Course> getAllCoure() {
        return courseRepository.findAll();
    }

    @Override
    public List<Review> getReviewsByCourse(String code) throws Exception {
        return courseRepository.findById(code).orElseThrow(()-> new Exception("course not found")).getReviews();
    }
}
