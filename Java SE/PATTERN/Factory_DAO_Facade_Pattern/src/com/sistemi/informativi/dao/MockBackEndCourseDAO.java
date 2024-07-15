package com.sistemi.informativi.dao;

import com.sistemi.informativi.bean.BackEndCourse;

import java.util.stream.Stream;


public interface MockBackEndCourseDAO {

    public Stream<Object> getBackEndCourses();
}
