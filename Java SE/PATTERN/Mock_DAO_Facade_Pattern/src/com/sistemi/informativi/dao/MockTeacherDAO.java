package com.sistemi.informativi.dao;

import com.sistemi.informativi.bean.Teacher;

import java.util.ArrayList;

public interface MockTeacherDAO {

    public void addTeacher();

    public void updateTeacher();

    public void removeTeacher();

    public ArrayList<Teacher> getTeachers();

}
