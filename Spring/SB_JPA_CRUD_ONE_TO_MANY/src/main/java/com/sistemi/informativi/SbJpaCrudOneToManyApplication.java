package com.sistemi.informativi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sistemi.informativi.entity.Course;
import com.sistemi.informativi.entity.Review;
import com.sistemi.informativi.facade.FacadeService;

@SpringBootApplication
public class SbJpaCrudOneToManyApplication implements CommandLineRunner{
	
	private FacadeService facadeService;
	
	public SbJpaCrudOneToManyApplication(FacadeService facadeService) {
		
		this.facadeService = facadeService;
	}

	public static void main(String[] args) {
		SpringApplication.run(SbJpaCrudOneToManyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// INSERIMENTO di un Course
		Course course = new Course("Java SE");
		facadeService.addCourse(course);
		
		// INSERIMENTO di 2 Review associate al Course Java SE
		Review review1 = new Review("Rome");
		Review review2 = new Review("Milan");
		
		// ASSOCIAZIONI DI 2 Review al course Java SE
		review1.setCourse(course);
		review2.setCourse(course);
		
		facadeService.addReview(review1);
		facadeService.addReview(review2);
		
		facadeService.getReviewsByCourse(1);
		
		facadeService.removeCourse(1);
		
		
	}

}
