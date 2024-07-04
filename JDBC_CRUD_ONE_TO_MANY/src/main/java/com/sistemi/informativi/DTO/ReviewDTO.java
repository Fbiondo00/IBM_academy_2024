package com.sistemi.informativi.DTO;

public class ReviewDTO {
    private String location;

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
