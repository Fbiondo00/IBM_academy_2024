package com.sistemi.informativi.dao;

import com.sistemi.informativi.bean.Teacher;

import java.util.ArrayList;

public class MockTeacherDAOImpl implements MockTeacherDAO{

    private static ArrayList<Teacher> teachers = new ArrayList<>();

    @Override
    public void addTeacher() {

        teachers.add(new Teacher("Gioele","Marini","gmarini@libero.it",17));
        teachers.add(new Teacher("Maria","proto","mproto@gmail.com",21));
        teachers.add(new Teacher("Giovanni","Sesti","gsesti@virgilio.it",10));

    }

    @Override
    public void updateTeacher() {

        Teacher teacherToUpdate = teachers.get(1);
        teacherToUpdate.setEmail("mproto@libero.it");

    }

    @Override
    public void removeTeacher() {

        teachers.remove(0);

    }

    @Override
    public ArrayList<Teacher> getTeachers() {

        return teachers;
    }
}
