package com.sistemi.informativi;

public abstract class Azienda {
	
	/*
	 * Ha senso utilizzare una CLASSE
	 * ASTRATTA QUANDO ALL'INTERNO
	 * DEL DOMINIO GERARCHICO DI 
	 * EREDITARIETA' VI SONO ALCUNE
	 * FUNZIONALITA' COMUNI AI FIGLI
	 * CHE I FIGLI INTENDONO IMPLEMENTARE
	 * IN MANIERA DIFFERENTE UNO DALL'ALTRO,
	 * E ALCUNE FUNZIONALITA' COMUNI AI FIGLI CHE
	 * I FIGLI HANNO INTENZIONE DI IMPLEMENTARE IN
	 * MANIERA ASSOLUTAMENTE IDENTICA
	 */
	
	public abstract void produce();
	
	public abstract void assume();
	
	public void fattura() {
		
		System.out.println("fattura con iva all 22%");
		
	}

}
