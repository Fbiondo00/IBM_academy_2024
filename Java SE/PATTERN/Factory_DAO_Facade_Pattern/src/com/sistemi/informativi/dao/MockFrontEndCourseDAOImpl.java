package com.sistemi.informativi.dao;

import com.sistemi.informativi.bean.BackEndCourse;
import com.sistemi.informativi.bean.FrontEndCourse;

import java.util.ArrayList;
import java.util.stream.Stream;

public class MockFrontEndCourseDAOImpl implements MockFrontEndCourseDAO{
    @Override
    public Stream<Object> getFrontEndCourses() {

        // MOCK

        ArrayList<String> languages1 = new ArrayList<>();
        languages1.add("Javascript");
        languages1.add("Typesctipt");

        ArrayList<String> frameworks1 = new ArrayList<>();
        frameworks1.add("RxJS");
        frameworks1.add("Axios");

        ArrayList<String> languages2 = new ArrayList<>();
        languages2.add("Dart");
        languages2.add("Go");

        ArrayList<String> frameworks2 = new ArrayList<>();
        frameworks2.add("Gin");
        frameworks2.add("Flutter");

        FrontEndCourse course1 =
                new FrontEndCourse("React JS","Florence",languages1,frameworks1,"Bootstrap");

        FrontEndCourse course2 =
                new FrontEndCourse("Flutter & GoLang","Neaples",languages2,frameworks2,"css");

        return Stream.of(course1,course2);

    }
}
