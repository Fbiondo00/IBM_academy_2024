package com.sistemi.informativi.dao;

import com.sistemi.informativi.bean.Student;

import java.util.ArrayList;

public class MockStudentDAOImpl implements MockStudentDAO {

    // MOCK
    private static ArrayList<Student> students = new ArrayList<>();


    @Override
    public void addStudent() {

        students.add(new Student("Mario","Rossi",21,true));
        students.add(new Student("Giada","Bianchi",26,true));
        students.add(new Student("Giuseppe","Verdi",24,false));


    }

    @Override
    public void updateStudent() {

        Student studentToUpdate = students.get(1);
        studentToUpdate.setAge(25);

    }

    @Override
    public void removeStudent() {

        students.remove(0);

    }

    @Override
    public ArrayList<Student> getStudents() {

        return students;
    }
}
