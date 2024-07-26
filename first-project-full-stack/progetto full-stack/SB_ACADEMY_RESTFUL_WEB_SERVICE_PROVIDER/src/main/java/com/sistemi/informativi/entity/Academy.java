package com.sistemi.informativi.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

@Entity
public class Academy implements Serializable{

	@Id
	@Column(length=4)
	@Size(min=4,max=4)
	private String code;
	
	@Column(length=50,nullable=false)
	private String title;
	
	@Column(name="city_location",length=50,nullable=false)
	private String cityLocation;
	
	
	@Column(name="students_number",nullable=false)
	private int studentsNumber;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCityLocation() {
		return cityLocation;
	}

	public void setCityLocation(String cityLocation) {
		this.cityLocation = cityLocation;
	}

	public int getStudentsNumber() {
		return studentsNumber;
	}

	public void setStudentsNumber(int studentsNumber) {
		this.studentsNumber = studentsNumber;
	}
	
	protected Academy() {
		
	}

	public Academy(String code, String title, String cityLocation, int studentsNumber) {
		
		this.code = code;
		this.title = title;
		this.cityLocation = cityLocation;
		this.studentsNumber = studentsNumber;
	}
	
	

}
