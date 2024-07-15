package com.sistemi.informativi.dao;

import com.sistemi.informativi.bean.Student;

import java.util.ArrayList;

public interface MockStudentDAO {

    public void addStudent();

    public void updateStudent();

    public void removeStudent();

    public ArrayList<Student> getStudents();

}
