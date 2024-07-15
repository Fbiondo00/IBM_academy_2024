package com.sistemi.informativi.bean;

public class Persona {
	
	private String nome;
	
	private String cognome;
	
	private int eta;
	
	/*
	 * RELAZIONE HAS-A
	 * La Classe Persona
	 * dichiara una variabile
	 * di istanza del tipo di 
	 * un'altra Classe (Indirizzo)
	 */
	private Indirizzo indirizzo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public Indirizzo getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}
	
	public Persona() {
		
	}

	public Persona(String nome, String cognome, int eta, Indirizzo indirizzo) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.indirizzo = indirizzo;
	}

	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + ", indirizzo=" + indirizzo + "]";
	}
	

}
