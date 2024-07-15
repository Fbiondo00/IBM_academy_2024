package com.sistemi.informativi.main;

import com.sistemi.informativi.bean.Person;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * UN MODO ATTRAVERSO IL QUALE JAVA
		 * IMPLEMENTA L'INFORMATION HIDING
		 * E' ASSOCIANDO LIVELLO DI VISIBILITA'
		 * PRIVATE ALLE VARIABILI DI ISTANZA
		 * E LIVELLO DI VISIBILITA' PUBLIC AI
		 * METODI DI SET E GET
		 */
		
		
		// NASCITA DELL'OGGETTO
		Person p1 = new Person();
		
		
		/*
		 * ALLOCAZIONE DI UNO SPAZIO FISICO
		 * ALL'INTERNO DELLO STACK
		 * TALE SPAZIO FISICO PERMANE FINO
		 * ALLA FINE DELL'ESECUZIONE DEL METODO
		 * 
		 * ALLA FINE DELL'ESECUZIONE DEL METODO
		 * LO SPAZIO FISICO VIENE DEALLOCATO
		 * 
		 */
		p1.setFirstName("Maria");
		
		p1.setLastName("Bianchini");
		p1.setAge(26);
		
		System.out.println(p1.getFirstName() + " " + p1.getLastName() + " " + p1.getAge() );
		

	}

}
