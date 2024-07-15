package com.sistemi.informativi.vo;

import java.io.Serializable;

public class ReviewVO implements Serializable {

    private int id;

    private String location;

    private int courseId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public ReviewVO(int id, String location, int courseId) {

        this.id = id;
        this.location = location;
        this.courseId = courseId;
    }

    public ReviewVO(String location){

        this.location = location;
    }

    @Override
    public String toString() {
        return "ReviewVO{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", courseId=" + courseId +
                '}';
    }
}
