package com.sistemi.informativi.facade;

import com.sistemi.informativi.bean.Recruiter;
import com.sistemi.informativi.bean.Student;
import com.sistemi.informativi.bean.Teacher;
import com.sistemi.informativi.dao.*;

import java.util.ArrayList;

public class FacadeDAOImpl implements FacadeDAO{

    // LOOSE COUPLING
    MockStudentDAO studentDAO = new MockStudentDAOImpl();

    // LOOSE COUPLING
    MockTeacherDAO teacherDAO = new MockTeacherDAOImpl();

    // LOOSE COUPLING
    MockRecruiterDAO recruiterDAO = new MockRecruiterDAOImpl();


    @Override
    public void addStudent() {

        /*
        invochiamo il metodo addStudent
        presente nella Classe MockStudentDAOImpl
        che già si occupa di aggiungere 3 student
        all'ArrayList statica
         */
        studentDAO.addStudent();

    }

    @Override
    public void updateStudent() {

         /*
        invochiamo il metodo updateStudent
        presente nella Classe MockStudentDAOImpl
        che già si occupa di aggiornare lo
        student con indice 1
         */
        studentDAO.updateStudent();

    }

    @Override
    public void removeStudent() {

        /*
        invochiamo il metodo removeStudent
        presente nella Classe MockStudentDAOImpl
        che già si occupa di cancellare lo
        student con indice 0
         */
        studentDAO.removeStudent();

    }

    @Override
    public ArrayList<Student> getStudents() {

        /*
        invochiamo il metodo getStudents
        presente nella Classe MockStudentDAOImpl
        che già si occupa di restuire una
        ArrayList contenente tutti gli student
         */
        return studentDAO.getStudents();
    }

    @Override
    public void addTeacher() {

        teacherDAO.addTeacher();

    }

    @Override
    public void updateTeacher() {

        teacherDAO.updateTeacher();

    }

    @Override
    public void removeTeacher() {

        teacherDAO.removeTeacher();

    }

    @Override
    public ArrayList<Teacher> getTeachers() {

        return teacherDAO.getTeachers();
    }

    @Override
    public void addRecruiter() {

        recruiterDAO.addRecruiter();

    }

    @Override
    public void updateRecruiter() {

        recruiterDAO.updateRecruiter();

    }

    @Override
    public void removeRecruiter() {

        recruiterDAO.removeRecruiter();

    }

    @Override
    public ArrayList<Recruiter> getRecruiters() {

        return recruiterDAO.getRecruiters();

    }
}
