package com.sistemi.informativi.document;

import org.springframework.data.mongodb.core.mapping.Document;

public class Review {

    private int id;

    private String location;

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

    protected Review(){}

    public Review(int id, String location) {
        this.id = id;
        this.location = location;
    }
}