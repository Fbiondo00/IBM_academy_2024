package com.sistemi.informativi.main;

import com.sistemi.informativi.SportNews;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * La dichiarazione di una variabile
		 * di tipo Interfaccia Funzionale
		 * assegnata all'implementazione di
		 * una funnzione rappresenta l0implementazione
		 * del metodo astratto dell' Interfaccia Funzionale
		 * (in pratica otteniamo un override dl metodo astratto
		 * del'Interfaccia che in OOP avremmo dovuto eseguire
		 * tramite una Classe Figlia dell'Interfaccia)
		 */
		SportNews sportNews = ()-> {
			
			System.out.println("Welcome");
		};
		
		// VANTAGGIO _ CODICE + COINCISO RISPETTO AL PARADIGMA OOP
		// SVANTAGGIO _PERDITA DI ALCUNE POSSIBILITA' FRA CUI IMPLEMENTAZIONE LOOSE COUPLING
		
		sportNews.sayWelcome();
		
		sportNews.basketNews();
		
		SportNews.footballNews();

	}

}
