package com.sistemi.informativi.facade;

import java.util.stream.Stream;

public interface FacadeDAO {

    public Stream<Object> getBackEndCourses();

    public Stream<Object> getFrontEndCourses();

}
