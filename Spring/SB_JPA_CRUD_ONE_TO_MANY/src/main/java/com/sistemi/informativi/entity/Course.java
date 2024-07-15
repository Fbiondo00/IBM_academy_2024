package com.sistemi.informativi.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Course implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String title;
	
	// RELAZIONE HAS A
	@OneToMany(fetch=FetchType.EAGER,mappedBy="course",cascade=CascadeType.ALL)
	private List<Review> reviews= new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	protected Course() {
		
	}

	public Course(String title) {
		
		this.title = title;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + "]";
	}
	

}
