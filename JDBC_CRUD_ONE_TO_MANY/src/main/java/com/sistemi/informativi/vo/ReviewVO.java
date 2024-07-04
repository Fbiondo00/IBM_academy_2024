package com.sistemi.informativi.vo;

public class ReviewVO {

    private String location;
    private int id;
    private int course_id;


    public ReviewVO(String location, int id, int course_id) {
        this.location = location;
        this.id = id;
        this.course_id = course_id;
    }

    public ReviewVO(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    @Override
    public String toString() {
        return "ReviewVO{" +
                "location='" + location + '\'' +
                '}';
    }
}
