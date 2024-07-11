package com.sistemi.informativi.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee implements Serializable{
	
	@Id
	@Column(name="passport_number")
	private String passportNumber;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="experience_years")
	private int experienceYears;

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getExperienceYears() {
		return experienceYears;
	}

	public void setExperienceYears(int experienceYears) {
		this.experienceYears = experienceYears;
	}
	
	protected Employee() {
		
	}

	public Employee(String passportNumber, String firstName, String lastName, int experienceYears) {
		
		this.passportNumber = passportNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.experienceYears = experienceYears;
	}

	@Override
	public String toString() {
		return "Employee [passportNumber=" + passportNumber + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", experienceYears=" + experienceYears + "]";
	}
	
	


}
