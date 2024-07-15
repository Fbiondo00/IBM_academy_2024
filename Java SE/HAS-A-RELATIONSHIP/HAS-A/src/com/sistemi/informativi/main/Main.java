package com.sistemi.informativi.main;

import com.sistemi.informativi.bean.Indirizzo;
import com.sistemi.informativi.bean.Persona;

public class Main {

	public static void main(String[] args) {
		
		Indirizzo indirizzo = new Indirizzo("Via dei Mille","20","00100","Roma");
		Persona persona = new Persona("Gero","Pesti",32,indirizzo);
		
		System.out.println(persona.toString());

	}

}
