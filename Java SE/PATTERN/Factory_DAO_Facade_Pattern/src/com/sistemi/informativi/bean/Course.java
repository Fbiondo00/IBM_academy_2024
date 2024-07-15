package com.sistemi.informativi.bean;

import java.util.ArrayList;

public class Course {

    private String name;

    private String location;

    // RELAZIONE HAS-A
    private ArrayList<String> languages;

    // RELAZIONE HAS-A
    private ArrayList<String> frameworks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<String> getLanguages() {
        return languages;
    }

    public void setLanguages(ArrayList<String> languages) {
        this.languages = languages;
    }

    public ArrayList<String> getFrameworks() {
        return frameworks;
    }

    public void setFrameworks(ArrayList<String> frameworks) {
        this.frameworks = frameworks;
    }

    public Course(String name, String location, ArrayList<String> languages, ArrayList<String> frameworks) {

        this.name = name;
        this.location = location;
        this.languages = languages;
        this.frameworks = frameworks;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", languages=" + languages +
                ", frameworks=" + frameworks +
                '}';
    }
}
