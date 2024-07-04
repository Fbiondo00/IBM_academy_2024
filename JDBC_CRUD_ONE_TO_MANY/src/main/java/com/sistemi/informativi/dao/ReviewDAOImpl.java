package com.sistemi.informativi.dao;

import com.sistemi.informativi.DTO.ReviewDTO;
import com.sistemi.informativi.sql.SqlScript;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.sistemi.informativi.connection.ConnectionManager;
import com.sistemi.informativi.vo.ReviewVO;


public class ReviewDAOImpl implements ReviewDAO {
    @Override
    public void addReview(ReviewDTO reiviewDTO) throws SQLException ,ClassNotFoundException{
        PreparedStatement ps = ConnectionManager.getPreparedStatement(SqlScript.sqlReviewInsert);
        ps.setString(1,reiviewDTO.getLocation());
        ps.setInt(2, reiviewDTO.getCourseId());
        ps.execute();
    }

    @Override
    public ArrayList<ReviewVO> getReviewsLocationByCourse(int idCourse) throws SQLException {

        ArrayList<ReviewVO> reviews = new ArrayList<>();
        ReviewVO reviewVO = null;

        PreparedStatement ps = ConnectionManager.getPreparedStatement(SqlScript.getSqlReviewLocationByCourse);
        ps.setInt(1, idCourse);
        ResultSet rs = ps.executeQuery();
        System.out.println("ciao");
        while(rs.next()){
            reviewVO = new ReviewVO(rs.getString("location"));
            System.out.println(reviewVO.toString());
            reviews.add(reviewVO);
        }
        return reviews;

    }
}
