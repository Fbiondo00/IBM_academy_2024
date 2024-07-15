package com.sistemi.informativi.dao;

import com.sistemi.informativi.bean.FrontEndCourse;

import java.util.stream.Stream;

public interface MockFrontEndCourseDAO {

    public Stream<Object> getFrontEndCourses();
}
