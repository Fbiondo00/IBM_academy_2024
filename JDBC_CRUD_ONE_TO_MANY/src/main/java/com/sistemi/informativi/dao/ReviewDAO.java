package com.sistemi.informativi.dao;

import com.sistemi.informativi.vo.*;
import com.sistemi.informativi.DTO.*;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ReviewDAO {

    public void addReview(ReviewDTO reiviewDTO) throws SQLException, ClassNotFoundException;
    public ArrayList<ReviewVO> getReviewsLocationByCourse(int idCourse) throws SQLException,ClassNotFoundException;


}
