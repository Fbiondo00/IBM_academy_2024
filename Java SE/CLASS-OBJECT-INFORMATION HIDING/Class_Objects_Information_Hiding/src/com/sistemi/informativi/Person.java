package com.sistemi.informativi;

// JAVA BEAN
public class Person {
	
	/*
	 * VARIABILI DI ISTANZA
	 */
	private String firstName;
	
	private String lastName;
	
	private int age;

	public String getFirstName() {
		
		return firstName;
	}

	// firma (signature)
	public void setFirstName(String firstName) {
		
		// corpo metodo
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
	
}
