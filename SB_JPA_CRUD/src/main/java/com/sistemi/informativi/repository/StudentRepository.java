package com.sistemi.informativi.repository;

import java.util.List;

import com.sistemi.informativi.entity.Student;

public interface StudentRepository {
	
	public void addStudent(Student student);
	
	public void updateStudent(Student student);
	
	public void removeStudent(int id);
	
	public List<Student> getStudents();
	
	public List<Student> getStudentsByLastName(String lastName);
	

}
