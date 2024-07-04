package com.sistemi.informativi.dao;

import com.sistemi.informativi.DTO.CourseDTO;
import com.sistemi.informativi.sql.SqlScript;


import java.sql.PreparedStatement;
import com.sistemi.informativi.connection.ConnectionManager;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CourseDAOImpl implements CourseDAO {

    @Override
    public int addCourse(CourseDTO courseDTO) throws SQLException, ClassNotFoundException{
        int id = -1;
        PreparedStatement ps = ConnectionManager.getPreparedStatement(SqlScript.sqlCourseInsert);
        ps.setString(1,courseDTO.getTitle());
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        if(rs.next()){
            id = rs.getInt(1);
        }
        return id;
    }

    @Override
    public void removeCourse(int i) throws SQLException {
        PreparedStatement ps = ConnectionManager.getPreparedStatement(SqlScript.sqlDeleteCourse);
        ps.setInt(1,i);
        ps.executeUpdate();
    }
}
