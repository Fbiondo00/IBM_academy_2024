package com.sistemi.informativi.main;

import com.sistemi.informativi.bean.Person;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * UNA OPERAZIONE COMPUTAZIONALE
		 * DURANTE LA QUALE VIENE ALLOCATO
		 * ALL'INTERNO DELL'HEAP UN OGGETTO
		 * SUBITO VALORIZZATO CON TUTTE LE
		 * VARIABILI DI ISTANZA
		 */
		Person p1 = new Person("Mario","Rossi",35);
		
		System.out.println(p1.toString());

	
	}

}
