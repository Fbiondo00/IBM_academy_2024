package com.sistemi.informativi.dao;

import com.sistemi.informativi.dto.CourseDTO;
import com.sistemi.informativi.dto.ReviewDTO;
import com.sistemi.informativi.vo.ReviewVO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public interface FacadeDAO {

    public Connection getConnection() throws SQLException, ClassNotFoundException;

    public int addCourse(CourseDTO courseDTO) throws SQLException, ClassNotFoundException;

    public void removeCourse(int id) throws SQLException, ClassNotFoundException;

    public void addReview(ReviewDTO reviewDTO) throws SQLException, ClassNotFoundException;

    public ArrayList<ReviewVO> getReviewLocationsByCourse(int courseId) throws SQLException, ClassNotFoundException;

    public void closeConnection() throws SQLException, ClassNotFoundException;


}
