package com.sistemi.informativi.facade;

import com.sistemi.informativi.entity.Course;
import com.sistemi.informativi.entity.Review;

public interface FacedeService {
    public void addCourse(Course course);

    public void deleteCourse(int id);

    public void addReview(Review review);

    public void getReviewbyCourse(int id);


}
