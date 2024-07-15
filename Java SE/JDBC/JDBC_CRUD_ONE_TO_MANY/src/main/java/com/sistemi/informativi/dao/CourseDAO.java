package com.sistemi.informativi.dao;

import com.sistemi.informativi.dto.CourseDTO;

import java.sql.SQLException;

public interface CourseDAO {

    public int addCourse(CourseDTO courseDTO) throws SQLException, ClassNotFoundException;

    public void removeCourse(int id) throws SQLException, ClassNotFoundException;
}
