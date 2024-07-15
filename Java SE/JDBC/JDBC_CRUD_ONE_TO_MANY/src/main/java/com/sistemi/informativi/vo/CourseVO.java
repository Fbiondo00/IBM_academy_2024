package com.sistemi.informativi.vo;

import java.io.Serializable;

public class CourseVO implements Serializable {

    private int id;

    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public CourseVO(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return "CourseVO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
