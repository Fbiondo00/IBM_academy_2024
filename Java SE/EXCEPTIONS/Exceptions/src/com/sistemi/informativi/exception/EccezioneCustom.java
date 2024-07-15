package com.sistemi.informativi.exception;

public class EccezioneCustom extends Exception {
	
	/*
	 * In questa questa fase creiamo una
	 * Classe EccezioneCustom e nel
	 * Costruttore invochiamo il Costruttore
	 * della Classe Padre che già stampa
	 * un messaggio ma più generico del nostro,
	 * in maniera tale da far stampare nel caso
	 * in cui si verifichi la nostra Eccezione
	 * un messaggio Custom
	 */
	
	
	public EccezioneCustom(String message) {
		
		super(message);
	}

}
