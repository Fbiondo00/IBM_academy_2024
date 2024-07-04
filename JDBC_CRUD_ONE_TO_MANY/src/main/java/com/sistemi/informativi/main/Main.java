package com.sistemi.informativi.main;

import com.sistemi.informativi.DTO.CourseDTO;
import com.sistemi.informativi.DTO.ReviewDTO;
import com.sistemi.informativi.connection.ConnectionManager;
import com.sistemi.informativi.dao.*;
import com.sistemi.informativi.vo.ReviewVO;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        FacadeDAO facadeDAO = new FacadeDAOImpl();

        Connection con = facadeDAO.getConnection();
        int id = facadeDAO.addCourse(new CourseDTO("React"));
        facadeDAO.addReview(new ReviewDTO("Florence", id));
        facadeDAO.addReview(new ReviewDTO("Tinbuktu", id));
        facadeDAO.addReview(new ReviewDTO("Honululu", id));

        facadeDAO.getReviewsLocation(id).forEach(System.out::println);

        //facadeDAO.deleteCourse(1);
        facadeDAO.closeConnection();
    }
}