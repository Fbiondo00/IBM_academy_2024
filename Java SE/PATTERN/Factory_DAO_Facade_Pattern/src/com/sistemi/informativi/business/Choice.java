package com.sistemi.informativi.business;

import com.sistemi.informativi.enumeration.Course;

import java.util.stream.Stream;

public interface Choice {

    public Stream<Object> choice(Course course);
}
