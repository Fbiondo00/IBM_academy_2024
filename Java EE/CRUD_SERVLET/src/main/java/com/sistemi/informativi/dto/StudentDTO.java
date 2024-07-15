package com.sistemi.informativi.dto;

import java.io.Serializable;

public class StudentDTO implements Serializable{
	
	private String firstName;
	
	private String lastName;
	
	private int age;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public StudentDTO(String firstName, String lastName, int age) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	

}
