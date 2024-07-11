package com.sistemi.informativi.service;

import com.sistemi.informativi.entity.Employee;

public interface EmployeeService {
	
	
	public void saveOrUpdateEmployee(Employee employee);
	
	public void removeEmployee(Employee employee);
	
	public void removeEmployee(String passportNumber);
	
	public void getEmployees();
	
	public void getEmployeesByLastName(String lastName);
	
	public void getEmployeesByExperienceYearsGreaterThan(int experienceYears);
	
	public Employee getEmployeeByPassportNumber(String passportNumber);
	
	
	

}
