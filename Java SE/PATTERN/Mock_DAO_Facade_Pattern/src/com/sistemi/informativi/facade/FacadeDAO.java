package com.sistemi.informativi.facade;

import com.sistemi.informativi.bean.Recruiter;
import com.sistemi.informativi.bean.Student;
import com.sistemi.informativi.bean.Teacher;

import java.util.ArrayList;

public interface FacadeDAO {

    public void addStudent();

    public void updateStudent();

    public void removeStudent();

    public ArrayList<Student> getStudents();

    public void addTeacher();

    public void updateTeacher();

    public void removeTeacher();

    public ArrayList<Teacher> getTeachers();

    public void addRecruiter();

    public void updateRecruiter();

    public void removeRecruiter();

    public ArrayList<Recruiter> getRecruiters();
}
