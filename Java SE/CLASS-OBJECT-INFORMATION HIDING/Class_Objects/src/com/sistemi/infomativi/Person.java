package com.sistemi.infomativi;

import java.util.Objects;

public class Person{
	
	/*
	 *variabili di istanza
	 * 
	 * variabile di istanza = 
	 * una variabile dichiarata
	 * internamente al corpo di una
	 * Classe, visibile in qualsiasi
	 * metodo della stessa Classe, di cui
	 * ogni Oggetto (Istanza) avrà una propria
	 * copia
	 */
    String firstName;
	
	String lastName;
	
	int age;

	@Override
	public int hashCode() {
		return Objects.hash(age, firstName, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName);
	}
	
	
	

}
