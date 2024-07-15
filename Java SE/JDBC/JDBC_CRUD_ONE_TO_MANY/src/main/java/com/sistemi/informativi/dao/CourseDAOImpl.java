package com.sistemi.informativi.dao;

import com.sistemi.informativi.connection.ConnectionManager;
import com.sistemi.informativi.dto.CourseDTO;
import com.sistemi.informativi.sql.SqlScript;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CourseDAOImpl implements CourseDAO{


    /**
     *
     * @param courseDTO
     * @return il valore della chiave prinmaria generata dopo l'inserimento
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    @Override
    public int addCourse(CourseDTO courseDTO) throws SQLException, ClassNotFoundException {

        int id = -1;

        // SqlScript.sqlCourseInsert = "insert into course(title)values(?);
        PreparedStatement ps = ConnectionManager.getPreparedStatement(SqlScript.sqlCourseInsert);
        ps.setString(1,courseDTO.getTitle());

        ps.executeUpdate();

        /*
        il metodo getGeneratedKeys (metodo di API)
        restituisce una Struttura Dati JDBC contenente
        una sola locazione di memoria che contiene il
        riferimento ad un Oggetto il quale a sua volta
        contiene il valore della chiave primaria generata
         */
        ResultSet rs = ps.getGeneratedKeys();

        if (rs.next()){

           id = rs.getInt(1);

        }

        return id;

    }

    /**
     *
     * @param id del corso da rimuovere
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    @Override
    public void removeCourse(int id) throws SQLException, ClassNotFoundException {

        // SqlScript.sqlCourseDelete = "delete from course where id=?;
        PreparedStatement ps = ConnectionManager.getPreparedStatement(SqlScript.sqlDeleteCourse);

        ps.setInt(1,id);

        ps.executeUpdate();


    }
}
