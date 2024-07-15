package com.sistemi.informativi.service;

import com.sistemi.informativi.entity.Student;

public interface StudentService {
	
	public void checkAddStudent(Student student);
	
	public void checkUpdateStudent(Student student);
	
	public void checkRemoveStudent(int id);
	
	public void checkGetStudents();
	
	public void checkGetStudentsByLastName(String lastName);

}
