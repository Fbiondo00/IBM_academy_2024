package com.sistemi.informativi.bean;

public class Person {
	
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

	/*
	 * Nel caso in cui si dichiari almeno un
	 * Costruttore Custom il costruttore di
	 * default vine "perso" dalla Classe
	 * a meno che non venga dichiarato
	 * esplicitamente
	 */
	public  Person(String firstName, String lastName, int age) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public Person() {
		
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	
	
	
	

}
