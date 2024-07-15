package com.sistemi.informativi.dao;

import com.sistemi.informativi.connection.ConnectionManager;
import com.sistemi.informativi.dto.CourseDTO;
import com.sistemi.informativi.dto.ReviewDTO;
import com.sistemi.informativi.vo.ReviewVO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class FacadeDAOImpl implements FacadeDAO{

    CourseDAO courseDAO = new CourseDAOImpl();
    ReviewDAO reviewDAO = new ReviewDAOImpl();

    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException {

          return ConnectionManager.getConnection();
    }

    @Override
    public int addCourse(CourseDTO courseDTO) throws SQLException, ClassNotFoundException {

          return courseDAO.addCourse(courseDTO);
    }

    @Override
    public void removeCourse(int id) throws SQLException, ClassNotFoundException {

           courseDAO.removeCourse(id);

    }

    @Override
    public void addReview(ReviewDTO reviewDTO) throws SQLException, ClassNotFoundException {

             reviewDAO.addReview(reviewDTO);

    }

    @Override
    public ArrayList<ReviewVO> getReviewLocationsByCourse(int courseId) throws SQLException, ClassNotFoundException {

             return reviewDAO.getReviewLocationsByCourse(courseId);

    }

    @Override
    public void closeConnection() throws SQLException, ClassNotFoundException {

             ConnectionManager.closeConnection();

    }
}
