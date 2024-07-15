package com.sistemi.informativi.bean;

public class Recruiter {

    private  String firstName;

    private String lastName;

    private String email;

    // RELAZIONE HAS-A
    private Agency agency;

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

    public Agency getAgency() {
        return agency;
    }

    public void setAgency(Agency agency) {
        this.agency = agency;
    }

    public Recruiter(String firstName, String lastName, String email, Agency agency) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.agency = agency;
    }

    @Override
    public String toString() {
        return "Recruiter{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", agency=" + agency +
                '}';
    }
}
