package com.sistemi.infomativi;

public class Main {
	
	

	public static void main(String[] args) {
		
		/*
		 * Ogni oggetto ha un ciclo
		 * di vita (nascita, vita e morte)
		 * gestito all'interno dell'HEAP
		 * (memoria dinamica interna alla JVM)
		 * 
		 * NASCITA = avviene nel momento in cui
		 * si usa la parola chiave new + costruttore
		 * 
		 * p1 rappresenta una reference all'Oggetto Person
		 * una reference rappresenta un controllo remoto
		 * su un Oggetto
		 */
		Person p1 = new Person(); 
		
		Person p2 = new Person();
		
		/*
		 *  vita di un oggetto =
		 *  modifica dello stato 
		 *  dell'Oggetto
		 */
		p1.firstName="Mario";
		p1.lastName = "Rossi";
		p1.age=21;
		
		p2.firstName = "Mario";
		p2.lastName = "Rossi";
		p2.age = 21;
		
		System.out.println("OGGETTO 1 " + p1.hashCode());
		System.out.println("OGGETTO 2 " + p2.hashCode());

		
		
		System.out.println(p1.firstName + " " + p1.lastName + " " + p1.age);
		
		System.out.println(p2.firstName + " " + p2.lastName + " " + p2.age);
		
		p1=p2;
		
		System.out.println(p1==p2);
		
		// ELIGIBLE FOR DESTRUCTION
		p1 = null;
		
		// BAD PRACTICE!!!!!!!
		System.gc();
		
		
		p2 = null;
		
		System.gc();
		
		
		
		
		/*
		 * assegnare una reference a null
		 * vuol dire comunicare al GC (Garbage Collector)
		 * che è un processo nativo eseguito internamente
		 * all'HEAP che non esiste più collegamento tra
		 * la reference e l'Oggetto per cui l'Oggetto
		 * diventa ELIGIBLE FOR DESTRUCTION
		 */
		
		
		/*
		 * 
		 * 200 righe
		 */
		
		
	}

}
 