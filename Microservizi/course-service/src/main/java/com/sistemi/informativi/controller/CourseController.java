package com.sistemi.informativi.controller;


import com.sistemi.informativi.document.Course;
import com.sistemi.informativi.document.Review;
import com.sistemi.informativi.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/rest/api/courses")
public class CourseController {

    private CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping
    public Course saveCourse(@RequestBody Course course) {
        return courseService.saveCourse(course);
    }

    @GetMapping
    public List<Course> getCourse() {
        return  courseService.getAllCoure();
    }

    @GetMapping("{code}/rewies-by-course")
    public List<Review> getCourseByCode(@PathVariable("code") String code) throws Exception {
        return courseService.getReviewsByCourse(code);
    }
}
