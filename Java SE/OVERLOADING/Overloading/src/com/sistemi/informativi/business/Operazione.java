package com.sistemi.informativi.business;

public class Operazione {
	
	/*
	 * IN JAVA OVERLOADING SIGNIFICA
	 * DICHIARARE ALL'INTERNO DELLA
	 * STESSA CLASSE PIU' DI UNA VOLTA
	 * UN METODO ESATTAMENTE CON LO STESSO
	 * NOME MA CONF FIRME DIFFERENTI ALMENO
	 * PER QUEL CHE CONCERNE LA LISTA DEI 
	 * PARAMETRI ED EVENTUALMENTE PER IL
	 * TIPO DI RITORNO
	 */
	
	public int somma(int x, int y) {
		
		return (x + y);
	}
	
	public int somma(int x, int y, int z) {
		
		return (x + y + z);
	}

}
