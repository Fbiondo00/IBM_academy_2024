package com.sistemi.informativi.dto;

import java.io.Serializable;

public class CourseDTO implements Serializable {

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CourseDTO(String title) {

        this.title = title;
    }
}
