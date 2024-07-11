package com.sistemi.informativi.service;

import com.sistemi.informativi.entity.Review;
import com.sistemi.informativi.repository.ReviewRepository;
import jakarta.persistence.EntityExistsException;
import jakarta.persistence.TransactionRequiredException;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReviewServiceImpl implements ReviewService{

    @Value("${get.error.message}")
    private String getErrorMessage;


    Logger log = LoggerFactory.getLogger(this.getClass());

    private ReviewRepository reviewRepository;
    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }
    @Override
    public void checkAddReview(Review review) {
        try {

            reviewRepository.addReview(review);

        }

        catch(IllegalArgumentException | EntityExistsException | TransactionRequiredException ex) {

            log.info(getErrorMessage);
            ex.printStackTrace();

        }
    }

    @Override
    public void checkReviewByCourse(int courseId) {
        try{
            List<Review> reviews = reviewRepository.getReviewByCourse(courseId);
            if(!reviews.isEmpty()){
                reviews.forEach(review->log.info(review.toString()));
            }else
                throw new NullPointerException();
        }catch (NullPointerException ex){
            log.info(getErrorMessage);
            ex.printStackTrace();
        }
    }
}











































