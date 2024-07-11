package com.sistemi.informativi.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.stereotype.Service;

import com.sistemi.informativi.entity.Employee;
import com.sistemi.informativi.repository.EmployeeRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
    Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Value("${add.update.success.message}")
	private String addUpdateSuccessMessage;
	
	@Value("${add.update.error.message}")
	private String addUpdateErrorMessage;
	
	@Value("${delete.success.message}")
	private String deleteSuccessMessage;
	
	@Value("${delete.error.message}")
	private String deleteErrorMessage;
	
	@Value("${get.error.message}")
	private String getErrorMessage;
	
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		
		this.employeeRepository = employeeRepository;
	}

	@Override
	public void saveOrUpdateEmployee(Employee employee) {
		
	
		try {
			
			// invocazione del metodo save (Spring Data JPA)
			employeeRepository.save(employee);
			log.info(addUpdateSuccessMessage);
			
		}
		catch(IllegalArgumentException | OptimisticLockingFailureException ex) {
			
			log.info(addUpdateErrorMessage);
			ex.printStackTrace();
			
		}
		
	}

	@Override
	public void removeEmployee(Employee employee) {
		
		try {
			
			// invocazione del metodo delete (Spring Data JPA)
			employeeRepository.delete(employee);
			log.info(deleteSuccessMessage);
		}
		
		catch(IllegalArgumentException | OptimisticLockingFailureException ex) {
			
			log.info(deleteErrorMessage);
			ex.printStackTrace();
		}
		
		
	}

	@Override
	public void removeEmployee(String passportNumber) {
		
		try {
			
			// invocazione del metodo deleteById (Spring Data JPA)
			employeeRepository.deleteById(passportNumber);
			log.info(deleteSuccessMessage);
		}
		
		catch(IllegalArgumentException ex) {
			
			log.info(deleteErrorMessage);
			ex.printStackTrace();
			
		}
		
	}

	@Override
	public void getEmployees() {
		
		try {
			// invocazione di un metodo findAll (Spring Data Jpa)
            List<Employee> employees = employeeRepository.findAll();
            if(!employees.isEmpty()){
                employees.forEach(employee -> log.info(employee.toString()));
            }else {
                throw new NullPointerException();
            }
        }catch (NullPointerException ex){
            log.info(getErrorMessage);
            ex.printStackTrace();
        }
		
	}

	@Override
	public void getEmployeesByLastName(String lastName) {
		
		try {
			// invocazione di un metodo custom firmato 
            List<Employee> employees = employeeRepository.findByLastName(lastName);
            if(!employees.isEmpty()){
                employees.forEach(employee -> log.info(employee.toString()));
            }else {
                throw new NullPointerException();
            }
        }catch (NullPointerException ex){
            log.info(getErrorMessage);
            ex.printStackTrace();
        }
		
	}

	@Override
	public void getEmployeesByExperienceYearsGreaterThan(int experienceYears) {
		
		try {
			// invocazione di un metodo custom firmato 
            List<Employee> employees = employeeRepository.
            		findByExperienceYearsGreaterThan(experienceYears);
            if(!employees.isEmpty()){
                employees.forEach(employee -> log.info(employee.toString()));
            }else {
                throw new NullPointerException();
            }
        }catch (NullPointerException ex){
            log.info(getErrorMessage);
            ex.printStackTrace();
        }
		
	}

	@Override
	public Employee getEmployeeByPassportNumber(String passportNumber) {
		
		// invocazione del metodo findById (Spring Data JPA)
		return employeeRepository.findById(passportNumber).
				orElseThrow(()-> new EntityNotFoundException(getErrorMessage));
		
	}
	
	

}
