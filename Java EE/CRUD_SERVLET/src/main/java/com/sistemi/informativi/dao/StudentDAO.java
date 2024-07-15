package com.sistemi.informativi.dao;

import java.sql.SQLException;

import com.sistemi.informativi.dto.StudentDTO;

public interface StudentDAO {
	
	public void addStudent(StudentDTO studentDTO) throws ClassNotFoundException,SQLException;

}
