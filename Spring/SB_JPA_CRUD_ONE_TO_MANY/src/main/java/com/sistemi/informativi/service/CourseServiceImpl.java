package com.sistemi.informativi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.sistemi.informativi.entity.Course;
import com.sistemi.informativi.repository.CourseRepository;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.TransactionRequiredException;

@Service
public class CourseServiceImpl implements CourseService{
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Value("${add.success.message}")
	private String addSuccessMessage;
	
	@Value("${add.error.message}")
	private String addErrorMessage;
	
	@Value("${delete.success.message}")
	private String deleteSuccessMessage;
	
	@Value("${delete.error.message}")
	private String deleteErrorMessage;
	
	
	/*
	 * Constructor Dependency Injection
	 * 
	 *  1. dichiarazione di tipo Interfaccia Padre della Classe che va istanziata
	 *  2. setting all'interno di un costruttore della variabile stessa
	 *  
	 *  L'IoC Container eseguirà la seguente operazione:
	 *  CourseRepository courseRepository = new CourseRepositoryImpl()
	 *  
	 *  La documentazione ufficiale di Spring consiglia
	 *  questa modalitù a partire dalla versione 3 di Spring boot
	 */
	private CourseRepository courseRepository;
	
	public CourseServiceImpl(CourseRepository courseRepository) {
		
		this.courseRepository = courseRepository;
	}
	

	@Override
	public void checkAddCourse(Course course) {
		
		try {

			courseRepository.addCourse(course);
			log.info(addSuccessMessage);

		}

		catch (IllegalArgumentException | EntityExistsException | TransactionRequiredException ex) {

			log.info(addErrorMessage);
			ex.printStackTrace();

		}
		
		
	}

	@Override
	public void checkRemoveCourse(int id) {
		
       try {
			
			courseRepository.removeCourse(id);
			log.info(deleteSuccessMessage);
		}
		
		catch(IllegalArgumentException | TransactionRequiredException ex) {
			
			log.info(deleteErrorMessage);
			ex.printStackTrace();
			
		}
		
	}

}
