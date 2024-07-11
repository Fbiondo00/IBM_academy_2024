package com.sistemi.informativi;

import com.sistemi.informativi.entity.Course;
import com.sistemi.informativi.entity.Review;
import com.sistemi.informativi.facade.FacedeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbJpaCrudOneToManyApplication implements CommandLineRunner {
    private FacedeService facadeService;

    public SbJpaCrudOneToManyApplication(FacedeService facadeService) {
        this.facadeService = facadeService;

    }



    public static void main(String[] args) {
        SpringApplication.run(SbJpaCrudOneToManyApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Course course = new Course("Java SE");
        facadeService.addCourse(course);
        Review review = new Review("Rome");
        Review review2 = new Review("Milan");

        review.setCourse(course);
        review2.setCourse(course);
        facadeService.addReview(review);
        facadeService.addReview(review2);

        facadeService.getReviewbyCourse(1);

    }
}
