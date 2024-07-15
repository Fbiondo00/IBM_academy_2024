package com.sistemi.informativi.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemi.informativi.entity.Student;
import com.sistemi.informativi.repository.StudentRepository;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.TransactionRequiredException;

@Service
public class StudentServiceImpl implements StudentService {

	Logger log = LoggerFactory.getLogger(this.getClass());

	/*
	 * L'annotation @Autowired rappresenta una delle 3 alternative fornite 
	 * da Spring per la Dependency Injection di uno Spring Bean
	 * 
	 * Dietro le quinte l'IoC Container eseguirà la seguente azione:
	 * 
	 * StudentRepository studentRepository = new StudentRepositoryImpl();
	 */
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void checkAddStudent(Student student) {

		try {

			studentRepository.addStudent(student);
			log.info("Operazione Inserimento Corretta");

		}

		catch (IllegalArgumentException | EntityExistsException | TransactionRequiredException ex) {

			log.info("Operazione Inserimento Errata");
			ex.printStackTrace();

		}

	}

	@Override
	public void checkUpdateStudent(Student student) {
		
		try {
			
			studentRepository.updateStudent(student);
			log.info("Operazione Aggiornamento Corretta");
			
		}
		
		catch(IllegalArgumentException | TransactionRequiredException ex) {
			
			log.info("Operazione Aggiornamento Errata");
			ex.printStackTrace();
		}

	}

	@Override
	public void checkRemoveStudent(int id) {
		
		try {
			
			studentRepository.removeStudent(id);
			log.info("Operazione Cancellazione Corretta");
		}
		
		catch(IllegalArgumentException | TransactionRequiredException ex) {
			
			log.info("Operazione Cancellazione Errata");
			ex.printStackTrace();
			
		}
		
		
	}

	@Override
	public void checkGetStudents() {
		
		try { 
			
			List<Student> students = studentRepository.getStudents();
			
			if(!students.isEmpty()) {
				
				students.forEach(student->log.info(student.toString()));
				
			}
			
			else throw new NullPointerException();
			
		}
		
		catch(NullPointerException ex) {
			
			log.info("Operazione Lettura Non Riuscita");
			
			ex.printStackTrace();
		}


	}

	@Override
	public void checkGetStudentsByLastName(String lastName) {
		
      try { 
			
			List<Student> students = studentRepository.getStudentsByLastName(lastName);
			
			if(!students.isEmpty()) {
				
				students.forEach(student->log.info(student.toString()));
				
			}
			
			else throw new NullPointerException();
			
		}
		
		catch(NullPointerException ex) {
			
			log.info("Operazione Lettura Non Riuscita");
			
			ex.printStackTrace();
		}
		
		

	}

}
