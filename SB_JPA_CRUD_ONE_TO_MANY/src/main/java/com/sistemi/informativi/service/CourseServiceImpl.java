package com.sistemi.informativi.service;

import com.sistemi.informativi.entity.Course;
import com.sistemi.informativi.repository.CourseRepository;
import jakarta.persistence.EntityExistsException;
import jakarta.persistence.TransactionRequiredException;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;

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
