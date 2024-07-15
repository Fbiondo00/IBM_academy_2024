package com.sistemi.informativi.dao;

import com.sistemi.informativi.builder.User;

import java.util.Date;

public class MockDAOImpl implements MockDAO{
    @Override
    public void addUser(User user) {

        /*
        Lo user in input a questo metodo
        viene inviato dal Main (quindi
        arriva uno User già costruito
        secondo una struttura fissa
        (firstName,lastName)
         */

        /*
        Una volta ricevuto l'Oggetto User gia' costruito con la struttura
        fissa dal Main, lo UserBuilder si occupa di settare e inserire
        all'interno dell'oggetto una registrationDate
         */
        User newUser = new User.UserBuilder(user.getFirstName(),user.getLastName())
                .setRegistrationDate(new Date(2019,22,12)).build();

        /*
        qui abbiamo un Oggetto UserBuilder che contiene
        firstname,lastName,registrationDate
        L'Oggetto UserBuild si passa in input tramite metodo
        build al costruttore di User che pertanto conterrà quanto
        già costruito dal builder

         */

        System.out.println(newUser.toString());

    }
}
