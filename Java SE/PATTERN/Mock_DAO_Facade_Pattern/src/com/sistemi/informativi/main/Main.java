package com.sistemi.informativi.main;

import com.sistemi.informativi.dao.*;
import com.sistemi.informativi.facade.FacadeDAO;
import com.sistemi.informativi.facade.FacadeDAOImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

//        /*
//         POLIMORFISMO
//         La reference di tipo Interfaccia Padre MockStudentDAO
//         assume la forma del figlio MockStudentDAOImpl (CLASSE CONCRETA)
//         POLIMORFISMO = implementazione intrinseca del pattern LOOSE COUPLING
//         Il Pattern DAO implementa a sua volta il pattern LOOSE COUPLING
//         riferendosi al disaccopiamento relativamente alle operazioni CRUD
//         */
//        MockStudentDAO studentDAO = new MockStudentDAOImpl();
//
//     // INSERIMENTO DI 3 students
//        studentDAO.addStudent();
//
//     // AGGIORNAMENTO student in posizione indice 1
//        studentDAO.updateStudent();
//
//     // CANCELLAZIONE student in posizione indice 0
//        studentDAO.removeStudent();
//
//        // RITORNO DI UNA ARRAYLIST CON 2 students
//        studentDAO.getStudents().forEach(System.out::println);
//
//        //--------------------------------------------------//
//
//        MockTeacherDAO teacherDAO = new MockTeacherDAOImpl();
//
//        // INSERIMENTO DI 3 teachers
//        teacherDAO.addTeacher();
//
//        // AGGIORNAMENTO teacher in posizione indice 1
//        teacherDAO.updateTeacher();
//
//        // CANCELLAZIONE teacher in posizione indice 0
//        teacherDAO.removeTeacher();
//
//        // RITORNO DI UNA ARRAYLIST CON 2 teachers
//        teacherDAO.getTeachers().forEach(System.out::println);
//
//        //--------------------------------------------------//
//
//        MockRecruiterDAO recruiterDAO = new MockRecruiterDAOImpl();
//
//        // INSERIMENTO DI 3 recruiters
//        recruiterDAO.addRecruiter();
//
//        // AGGIORNAMENTO DI  recruiter in posizione indice 1
//        recruiterDAO.updateRecruiter();
//
//        // CANCELLAZIONE DI  recruiter in posizione indice 0
//        recruiterDAO.removeRecruiter();
//
//       // RITORNO DI UNA ARRAYLIST con 2 recruiter
//       recruiterDAO.getRecruiters().forEach(System.out::println);
//
//        //--------------------------------------------------//

        FacadeDAO facadeDAO= new FacadeDAOImpl();

        facadeDAO.addStudent();

        facadeDAO.updateStudent();

        facadeDAO.removeStudent();

        facadeDAO.getStudents().forEach(System.out::println);

        facadeDAO.addTeacher();

        facadeDAO.updateTeacher();

        facadeDAO.removeTeacher();

        facadeDAO.getTeachers().forEach(System.out::println);

        facadeDAO.addRecruiter();

        facadeDAO.updateRecruiter();

        facadeDAO.removeRecruiter();

        facadeDAO.getRecruiters().forEach(System.out::println);



    }
}