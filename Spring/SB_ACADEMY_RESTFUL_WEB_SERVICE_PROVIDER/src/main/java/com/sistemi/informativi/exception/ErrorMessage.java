package com.sistemi.informativi.exception;

import java.util.Date;

/*
 * Costruzione di un Oggetto
 * che venga successivamente
 * convertito dal Jackson Object
 * Mapper in un json contenente
 * come proprietà:
 * statusCode dell'errore
 * data in cui si verifica l'errore
 * messaggio custom dell'errore : (code con dimensione errata...)
 * descrizione errore
 */
public class ErrorMessage {
	
	private int statusCode;
	
	private Date date;
	
	private String message;
	
	private String description;

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	protected ErrorMessage() {
		
	}

	public ErrorMessage(int statusCode, Date date, String message, String description) {
		
		this.statusCode = statusCode;
		this.date = date;
		this.message = message;
		this.description = description;
	}
	

}
