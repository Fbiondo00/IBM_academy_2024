package com.sistemi.informativi.main;

import com.sistemi.informativi.builder.User;
import com.sistemi.informativi.dao.MockDAO;
import com.sistemi.informativi.dao.MockDAOImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        /*
        creazione Oggetto co
        Struttura fissa

        UserBuilder costruisce tramite SUO costruttore
        un Oggetto UserBuilder che poi passa in input
        al costruttore di User tramite metodo build
         */
        User user = new User.UserBuilder("Mario","Rossi").build();

        MockDAO mockDAO  = new MockDAOImpl();
        /*
        invocazione del metodo addUser
        del DAOLayer che aggiungerà alla Struttura
        fissa dell'Oggetto una registrationDate
         */
        mockDAO.addUser(user);


        }
    }
