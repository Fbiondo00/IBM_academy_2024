package com.sistemi.informativi.bean;

public class Student {

    private String firstName;

    private String lastName;

    private int age;

    private boolean isEnabled;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }


    public Student(String firstName, String lastName, int age, boolean isEnabled) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isEnabled = isEnabled;
    }


    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", isEnabled=" + isEnabled +
                '}';
    }
}
