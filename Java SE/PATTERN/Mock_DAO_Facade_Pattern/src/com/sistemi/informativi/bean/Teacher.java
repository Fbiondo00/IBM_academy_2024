package com.sistemi.informativi.bean;

public class Teacher {

    private String firstName;

    private String lastName;

    private String email;

    private int experienceYears;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public Teacher(String firstName, String lastName, String email, int experienceYears) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.experienceYears = experienceYears;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", experienceYears=" + experienceYears +
                '}';
    }
}
