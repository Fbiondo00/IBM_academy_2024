package com.sistemi.informativi.dao;

import com.sistemi.informativi.DTO.CourseDTO;

import java.sql.SQLException;

public interface CourseDAO {
        public int addCourse(CourseDTO courseDTO) throws SQLException,ClassNotFoundException;

        public void removeCourse(int i) throws SQLException,ClassNotFoundException;

}
