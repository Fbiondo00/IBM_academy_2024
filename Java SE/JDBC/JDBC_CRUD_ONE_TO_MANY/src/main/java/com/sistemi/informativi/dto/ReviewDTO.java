package com.sistemi.informativi.dto;

import java.io.Serializable;

public class ReviewDTO implements Serializable {

    private String location;

    // mapping della FK
    private int courseId;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public ReviewDTO(String location, int courseId) {

        this.location = location;
        this.courseId = courseId;
    }
}
