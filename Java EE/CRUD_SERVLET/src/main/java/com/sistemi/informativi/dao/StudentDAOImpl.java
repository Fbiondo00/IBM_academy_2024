package com.sistemi.informativi.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sistemi.informativi.connection.ConnectionManager;
import com.sistemi.informativi.dto.StudentDTO;
import com.sistemi.informativi.sql.SqlScript;

public class StudentDAOImpl implements StudentDAO{

	@Override
	public void addStudent(StudentDTO studentDTO) throws ClassNotFoundException, SQLException {
		
		PreparedStatement ps = ConnectionManager.getPreparedStatement(SqlScript.sqlInsertStudent);
		ps.setString(1, studentDTO.getFirstName());
		ps.setString(2, studentDTO.getLastName());
		ps.setInt(3, studentDTO.getAge());
		
		ps.executeUpdate();
		
	}

}
