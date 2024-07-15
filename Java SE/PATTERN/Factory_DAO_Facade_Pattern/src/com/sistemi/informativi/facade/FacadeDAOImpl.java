package com.sistemi.informativi.facade;

import com.sistemi.informativi.dao.MockBackEndCourseDAO;
import com.sistemi.informativi.dao.MockBackEndCourseDAOImpl;
import com.sistemi.informativi.dao.MockFrontEndCourseDAO;
import com.sistemi.informativi.dao.MockFrontEndCourseDAOImpl;

import java.util.stream.Stream;

public class FacadeDAOImpl implements FacadeDAO{

    MockBackEndCourseDAO beDAO = new MockBackEndCourseDAOImpl();
    MockFrontEndCourseDAO feDAO = new MockFrontEndCourseDAOImpl();


    @Override
    public Stream<Object> getBackEndCourses() {

        return beDAO.getBackEndCourses();
    }

    @Override
    public Stream<Object> getFrontEndCourses() {

        return feDAO.getFrontEndCourses();
    }
}
