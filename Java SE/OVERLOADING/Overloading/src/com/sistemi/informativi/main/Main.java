package com.sistemi.informativi.main;

import com.sistemi.informativi.business.Operazione;

public class Main {

	public static void main(String[] args) {
		
		Operazione operazione = new Operazione();
		
		System.out.println("SOMMA1 " + operazione.somma(7,6));
		System.out.println("SOMMA2 " + operazione.somma(7,6,9));

	}

}
