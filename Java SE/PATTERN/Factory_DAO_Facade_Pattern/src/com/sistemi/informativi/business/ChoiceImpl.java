package com.sistemi.informativi.business;

import com.sistemi.informativi.enumeration.Course;
import com.sistemi.informativi.facade.FacadeDAO;
import com.sistemi.informativi.facade.FacadeDAOImpl;

import java.util.stream.Stream;

public class ChoiceImpl implements Choice{

    @Override
    public Stream<Object> choice(Course course){

     Stream<Object> courses = null;

     FacadeDAO facadeDAO = new FacadeDAOImpl();


        courses= switch (course) {

            case BACKEND -> facadeDAO.getBackEndCourses();
            case FRONTEND -> facadeDAO.getFrontEndCourses();
            default -> throw new IllegalStateException("Option not avalaible ");
        };

        return courses;

    }
}
