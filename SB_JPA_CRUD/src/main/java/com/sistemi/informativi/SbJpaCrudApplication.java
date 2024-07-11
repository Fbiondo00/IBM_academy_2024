package com.sistemi.informativi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sistemi.informativi.entity.Student;
import com.sistemi.informativi.service.StudentService;

/*
 * LA CLASSE ANNOTATA CON @SpringBootApplication
 * RAPPRESENTA L'Application Context
 */
@SpringBootApplication
public class SbJpaCrudApplication implements CommandLineRunner{
	
	/*
	 * Dependency Injection del Service Layer
	 * Dietro le quinte l'IoC Container eseguirà
	 * la sguente operazione:
	 * StudentService studentService = new StudentServiceImpl();
	 */
	@Autowired
	private StudentService studentService;

	public static void main(String[] args) {
		SpringApplication.run(SbJpaCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		studentService.checkAddStudent(new Student("Paolo","Fierini",30));
		studentService.checkAddStudent(new Student("Mario","Rossi",23));
		studentService.checkAddStudent(new Student("Giuseppe","Verdini",25));
		studentService.checkAddStudent(new Student("Gioele","Verdini",23));
		
		studentService.checkUpdateStudent(new Student(4,"Gioele","Verdini",24));
		
		studentService.checkRemoveStudent(1);
		
		studentService.checkGetStudents();
		
		studentService.checkGetStudentsByLastName("Verdini");
		
		
	}

}
