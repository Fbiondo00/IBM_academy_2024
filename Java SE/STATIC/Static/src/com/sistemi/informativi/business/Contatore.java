package com.sistemi.informativi.business;

public class Contatore {
	
	/*
	 * VARIABILE DI CLASSE
	 */
	private static int x;
	
	/*
	 * UN METODO STATIC é 
	 * DENOMINATO DAL LINGUAGGIO JAVA
	 * ANCHE METODO DI CLASSE
	 */
	public static void conta() {
		
		x = x + 1;
		
		System.out.println(x);

	}

}
