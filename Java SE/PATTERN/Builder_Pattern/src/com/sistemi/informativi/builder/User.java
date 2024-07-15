package com.sistemi.informativi.builder;

import java.util.Date;

public class User {

    // INFO STRUTTURA INIZIALE
    private String firstName;

    private String lastName;

    // INFO STRUTTURA "AUGMENTED"
    private Date registrationDate;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    private User(UserBuilder userBuilder){

        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.registrationDate = userBuilder.registrationDate;

    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", registrationDate=" + registrationDate +
                '}';
    }


    public User(String firstName, String lastName, Date registrationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registrationDate = registrationDate;
    }

    public static class UserBuilder {

        private String firstName;

        private String lastName;

        // INFO DELLA STRUTTURA "AUGMENTED"
        private Date registrationDate;


        public UserBuilder setRegistrationDate(Date registrationDate){

            this.registrationDate = registrationDate;
            return this;

        }

        public UserBuilder(String firstName, String lastName) {

            this.firstName = firstName;
            this.lastName = lastName;
        }

        public User build(){

            return new User(this);


        }


    }






}
