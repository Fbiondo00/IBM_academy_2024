package com.sistemi.informativi.main;

import com.sistemi.informativi.connection.ConnectionManager;
import com.sistemi.informativi.dao.StudentDAO;
import com.sistemi.informativi.dao.StudentDAOImpl;
import com.sistemi.informativi.dto.StudentDTO;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {


    public static void main(String[] args) throws SQLException, ClassNotFoundException {

    // RICHIESTA DI APERTURA DI UNA CONNESSIONE
    Connection con = ConnectionManager.getConnection();

    // LOOSE COUPLING
        StudentDAO studentDAO = new StudentDAOImpl();

    // INIZIO TEST INSERIMENTO
     StudentDTO studentToAdd = new StudentDTO("Alice","Verdini",22);

     studentDAO.addStudent(studentToAdd);
     // FINE TEST INSERIMENTO


     // INIZIO TEST AGGIORNAMENTO
      StudentDTO studentToUpdate = new StudentDTO("Giada","Proto",30);
      studentDAO.updateStudent(studentToUpdate,4);
      // FINE TEST AGGIORNAMENTO

        // INIZIO TEST REMOVE
        studentDAO.removeStudent(5);
        // FINE TEST REMOVE

        // INIZIO TEST GET
        studentDAO.getStudents().forEach(System.out::println);
        // FINE TEST GET

        ConnectionManager.closeConnection();;

    }


}
