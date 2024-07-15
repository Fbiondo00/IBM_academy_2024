package com.sistemi.informativi.bean;

public class Indirizzo {

	private String via;

	private String nCivico;

	private String cap;

	private String citta;

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getnCivico() {
		return nCivico;
	}

	public void setnCivico(String nCivico) {
		this.nCivico = nCivico;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public Indirizzo() {

	}

	public Indirizzo(String via, String nCivico, String cap, String citta) {

		this.via = via;
		this.nCivico = nCivico;
		this.cap = cap;
		this.citta = citta;
	}

	@Override
	public String toString() {
		return "Indirizzo [via=" + via + ", nCivico=" + nCivico + ", cap=" + cap + ", citta=" + citta + "]";
	}

}
