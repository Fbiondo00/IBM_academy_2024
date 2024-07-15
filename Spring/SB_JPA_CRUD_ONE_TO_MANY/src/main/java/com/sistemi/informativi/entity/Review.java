package com.sistemi.informativi.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Review implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String location;
	
	// RELAZIONE HAS-A
	/*
	 * Hibernate creeerà all'interno
	 * della tabella review una fk
	 * dandole di default il nome usato
	 * per la variabile_nome pk dell'Entity
	 * Padre
	 */
	@ManyToOne
	private Course course;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	protected Review() {
		
	}

	public Review(String location) {

		this.location = location;

	}

	@Override
	public String toString() {
		return "Review [id=" + id + ", location=" + location + "]";
	}
	
}
