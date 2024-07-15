package com.sistemi.informativi.bean;

import java.util.ArrayList;

public class BackEndCourse extends Course{

    private String database;

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public BackEndCourse(String name, String location, ArrayList<String> languages, ArrayList<String> frameworks, String database) {

        super(name, location, languages, frameworks);
        this.database = database;
    }

    @Override
    public String toString() {
        return super.toString() + "database='" + database + '\'' + '}';
    }
}
