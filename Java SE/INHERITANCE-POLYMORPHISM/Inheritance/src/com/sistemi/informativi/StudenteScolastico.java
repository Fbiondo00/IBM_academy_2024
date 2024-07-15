package com.sistemi.informativi;

public class StudenteScolastico extends Studente {

	
	/*
	 * OVERRIDING significa dichiarare
	 * all'interno di una Classe Figlia
	 * un metodo ereditato dal Padre
	 * mantenendone intatta la firma
	 * ma cambiandone il corpo
	 */
	@Override
	public void studia() {
		
		System.out.println("studia da maggio a settembre");
	}
	
}
