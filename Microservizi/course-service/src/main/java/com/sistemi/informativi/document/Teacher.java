package com.sistemi.informativi.document;

public class Teacher {

    private String firstname;

    private String lastname;

    private int experienceName;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getExperienceName() {
        return experienceName;
    }

    public void setExperienceName(int experienceName) {
        this.experienceName = experienceName;
    }

    public Teacher(String firstname, String lastname, int experienceName) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.experienceName = experienceName;
    }

    protected Teacher() {}
}