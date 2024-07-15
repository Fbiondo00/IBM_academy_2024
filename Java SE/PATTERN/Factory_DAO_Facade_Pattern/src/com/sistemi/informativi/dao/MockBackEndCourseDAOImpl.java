package com.sistemi.informativi.dao;

import com.sistemi.informativi.bean.BackEndCourse;

import java.util.ArrayList;
import java.util.stream.Stream;

public class MockBackEndCourseDAOImpl implements MockBackEndCourseDAO{


    @Override
    public Stream<Object> getBackEndCourses() {

        // MOCK

        ArrayList<String> languages1 = new ArrayList<>();
        languages1.add("Java");
        languages1.add("JPQL");

        ArrayList<String> frameworks1 = new ArrayList<>();
        frameworks1.add("Spring MVC");
        frameworks1.add("Spring Restful");

        ArrayList<String> languages2 = new ArrayList<>();
        languages2.add("C#");
        languages2.add("LinQ");

        ArrayList<String> frameworks2 = new ArrayList<>();
        frameworks2.add("WPF");
        frameworks2.add("WCF");

        BackEndCourse course1 =
                new BackEndCourse("Java Spring","Rome",languages1,frameworks1,"mySQL");

        BackEndCourse course2 =
                new BackEndCourse(".Net","Milan",languages2,frameworks2,"sqlServer");




        return Stream.of(course1,course2);


    }
}
