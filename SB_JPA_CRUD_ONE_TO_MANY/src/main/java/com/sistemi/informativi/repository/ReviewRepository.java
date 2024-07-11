package com.sistemi.informativi.repository;

import com.sistemi.informativi.entity.Review;

import java.util.List;

public interface ReviewRepository {

    public void addReview(Review review);

    public List<Review> getReviewByCourse(int courseId);
}
