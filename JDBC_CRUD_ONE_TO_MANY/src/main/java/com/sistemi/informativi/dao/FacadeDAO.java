package com.sistemi.informativi.dao;

import com.sistemi.informativi.DTO.*;


import com.sistemi.informativi.vo.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;


public interface FacadeDAO {
    ArrayList<ReviewVO> getReviewsLocation(int idCourse) throws SQLException, ClassNotFoundException;

    public Connection getConnection() throws SQLException, ClassNotFoundException;
    public void closeConnection() throws SQLException, ClassNotFoundException;
    public int addCourse(CourseDTO courseDTO) throws SQLException, ClassNotFoundException;
    public void removeCourse(int i)throws SQLException, ClassNotFoundException;
    public void addReview(ReviewDTO reviewDTO) throws SQLException, ClassNotFoundException;
}
