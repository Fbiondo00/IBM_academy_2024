package com.sistemi.informativi.dao;

import com.sistemi.informativi.connection.ConnectionManager;
import com.sistemi.informativi.dto.ReviewDTO;
import com.sistemi.informativi.sql.SqlScript;
import com.sistemi.informativi.vo.ReviewVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReviewDAOImpl implements ReviewDAO{

    /**
     *
     * @param reviewDTO contiene le informazioni del corso da inserire
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    @Override
    public void addReview(ReviewDTO reviewDTO) throws SQLException, ClassNotFoundException {

        // SqlScript.sqlReviewInsert = "insert into review(location,course_id)values(?,?);
        PreparedStatement ps = ConnectionManager.getPreparedStatement(SqlScript.sqlReviewInsert);
        ps.setString(1,reviewDTO.getLocation());
        ps.setInt(2,reviewDTO.getCourseId());

        ps.executeUpdate();


    }

    /**
     *
     * @param courseId del corso rispetto al quale crecare le versioni associate
     * @return una ArrayList contenente riferimenti ad ogetti RevieVO serializzati (i VO contengono le location delle versioni)
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    @Override
    public ArrayList<ReviewVO> getReviewLocationsByCourse(int courseId) throws SQLException, ClassNotFoundException {

        /*
        inizizalizzazione di una ArrayList che conterrà
        oggetti ReviewVO serializzati. Ogni oggetto
        VO sarà una copia dell'Oggetto originario del
        ResultSet (non serializzato)
         */
        ArrayList<ReviewVO> reviews = new ArrayList<>();

        ReviewVO reviewVO = null;


        /*
        Quando occorre eseguire delle query (operazioni di lettura) parametriche
        è necessario utilizzare l'Oggetto PreparedStatement in quanto occorre sostituire
        concretamente i placeholder, e lo si può fare solo tramite l'API Prepared Statement
        che rende possibile concretizzare i placeholde tramite i metodi di set
        (l'API Statement non ha i metodi di set, per cui non è utilizzabile per sostituire
        i placeholder in na query parametrica)

        BEST PRACTICE :
        - utilizzare l'API Statement per query cohe non contengono parametri (letture integrali)
        - utilizzare l'API PreparedStatement per query parametriche
         */

       // "select location from review,course where review.course_id=course.id and course.id=?";
        PreparedStatement ps = ConnectionManager.getPreparedStatement(SqlScript.sqlReviewsLocationByCourse);

        ps.setInt(1,courseId);
        // "select location from review,course where review.course_id=course.id and course.id=10;

        // query concretizzata senza placeholder ma con un valore reale courseId passato in input al metodo

        /*
        invocando il metodo executeQuery su un PreparedStatement già concreto
        si ricava un ResultSet contenente già i risultati della lettura
         */
        ResultSet rs = ps.executeQuery();

        while(rs.next()){

            reviewVO = new ReviewVO(rs.getString("location"));

            reviews.add(reviewVO);


        }

        return reviews;
    }
}
