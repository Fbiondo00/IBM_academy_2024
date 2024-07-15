package com.sistemi.informativi.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.sistemi.informativi.entity.Review;
import com.sistemi.informativi.repository.ReviewRepository;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.TransactionRequiredException;

@Service
public class ReviewServiceImpl implements ReviewService {

	Logger log = LoggerFactory.getLogger(this.getClass());

	@Value("${add.success.message}")
	private String addSuccessMessage;

	@Value("${add.error.message}")
	private String addErrorMessage;

	@Value("${get.error.message}")
	private String getErrorMessage;

	private ReviewRepository reviewRepository;

	public ReviewServiceImpl(ReviewRepository reviewRepository) {

		this.reviewRepository = reviewRepository;
	}

	@Override
	public void checkAddReview(Review review) {

		try {

			reviewRepository.addReview(review);
			log.info(addSuccessMessage);

		}

		catch (IllegalArgumentException | EntityExistsException | TransactionRequiredException ex) {

			log.info(addErrorMessage);
			ex.printStackTrace();

		}
	}

	@Override
	public void checkReviewsByCourse(int courseId) {
		
		try{
            List<Review> reviews = reviewRepository.getReviewsByCourse(courseId);
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
