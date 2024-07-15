package com.sistemi.informativi.dao;

import com.sistemi.informativi.dto.ReviewDTO;
import com.sistemi.informativi.vo.ReviewVO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ReviewDAO {

    public void addReview(ReviewDTO reviewDTO) throws SQLException, ClassNotFoundException;

    public ArrayList<ReviewVO> getReviewLocationsByCourse(int courseId) throws SQLException, ClassNotFoundException;

}
