package com.sistemi.informativi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemi.informativi.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,String>{

	/*estendendo JpaRepository ereditiamo metodi esposti da
	 questa interfaccia che contengono già logica di crud
	 *
	 * ESEMPIO :
	 *
	 * save --->>>> INSERIMENTO, AGGIORNAMENTO
	 * findAll --->>>> LETTURA INTEGRALE
	 * findById --->>>> RICERCA PER PK
	 * deleteById--->>> CANCELLAZIONE PER PK
	 *
	 */

	/*
	 * La parola chiave find viene tradotta in select e from Employee e
	 * La parola chiave By viene tradotta in where
	 * Dopo la parola chiave By occorre inserire il nome di una variabile
	 * di istanza dell'Entity (con la prima lettera Maiuscola)
	 *
	 * TRADUZIONE FINALE : select e from Employee e where e.lastName=
	 * lastName passato in input al metodo
	 */
	public List<Employee> findByLastName(String lastName);

	/*
	 * TRADUZIONE FINALE:
	 * select e from employee e where e.experienceYears >
	 * experienceYears passato in input al metodo
	 */
	public List<Employee> findByExperienceYearsGreaterThan(int experienceYears);



}
