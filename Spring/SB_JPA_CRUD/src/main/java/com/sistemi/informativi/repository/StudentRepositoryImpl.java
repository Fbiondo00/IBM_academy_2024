package com.sistemi.informativi.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sistemi.informativi.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Transactional
@Repository
public class StudentRepositoryImpl implements StudentRepository{
	
	/*
	 * L'annotation @PersistenceContext
	 * rappresenta una annotation tramite
	 * la quale viene effettuata Dependency
	 * Injection delle API figlie di EntityManager
	 * 
	 * La Dependency Injection è uno strumento 
	 * sintattico che consente di implementare
	 * il pattern IoC
	 */
	@PersistenceContext 
	private EntityManager em;
	

	
	@Override
	public void addStudent(Student student) {
		
		/*
		 * Hibernate compie le seguenti azioni;
		 * estrapola il contenuto dell'Oggetto in
		 * input, verifica se l'Oggetto è una 
		 * Entity JPA, e traduce le variabili
		 * di istanza contenute nell'Oggetto nelle
		 * corrispondenti colonne della tabella 
		 * corrispondente all'Entity; alla fine
		 * traduce in uno script di insert
		 * 
		 * slqHibernate = insert into student(first_name,last_name,age) 
		 * values(contenuto dell'oggetto) 
		 * 
		 * Grazie all'annotation @Transactional Hibernate comprende
		 * che c'è una connessione aperta verso il database per cui
		 * esegue lo script sql corrispondente al metodo persist
		 * dopo di che Hibernate stesso chiude la connessione
		 * 
		 * Grazie all'invocazione del metodo persit l'Oggetto
		 * Entity transa dallo stato NEW allo stato MANAGED
		 * Un Oggetto Managed viene collocato all'interno di una
		 * speciale area di memoria della JVM, chiamata Contesto
		 * di Persistenza, all'interno della quale va a leggere
		 * Hibernate per fare operazionisul database che riguardano
		 * quell'oggetto Entity
		 */
		em.persist(student);
		
		
	}

	@Override
	public void updateStudent(Student student) {
		
		/*
		 * in input al metodo updateStudent passeremo
		 * durante la usa invocazione un costruttore
		 * contenente anche l'id
		 * 
		 * Grazie al metodo merge Hibernate comprende
		 * che deve eseguire una operazione di aggiornamento
		 * Controlla che all'interno dell'oggetto passato
		 * in input esista un valore di PK
		 * Se non trova sul database l'id passato nell'Oggetto
		 * restituisce una eccezione
		 * Se l'id esiste sul database Hibernate traduce il metodo
		 * merge nel seguente script sql :
		 * update student set first_name=firstName Oggetto, 
		 * set last_name=lastName Oggetto, age = age Oggetto
		 * where id = id Oggetto
		 * 
		 */
		em.merge(student);
		
		
		
	}

	@Override
	public void removeStudent(int id) {
		
		/*
		 * Hibernate traduce in
		 * select * from student where 
		 * id=id passato in input al metodo
		 */
		Student studentToRemove = em.find(Student.class, id);
		
		/*
		 * Hibernate traduce in:
		 * delete from student where id=
		 * id passato in input
		 */
		em.remove(studentToRemove);
		
		
		
	}

	@Override
	public List<Student> getStudents() {
		
		/*
		 * Hibrenate riceve in input la seguente NamedQuery:
		 * "select s from Student s"(JQPL)
		 * Hibernate traduce la query JPQL nella
		 * seguente query sql : select * from student
		 * 
		 */
		return em.createNamedQuery("Student.getStudents",Student.class).getResultList();
	
	}

	@Override
	public List<Student> getStudentsByLastName(String lastName) {
		
		// "select s from Student s where s.lastName=:lastName"
		return em.createNamedQuery("Student.getStudentsByLastName",Student.class).
		setParameter("lastName",lastName).getResultList();
		
		
		
	}
	
	

}
