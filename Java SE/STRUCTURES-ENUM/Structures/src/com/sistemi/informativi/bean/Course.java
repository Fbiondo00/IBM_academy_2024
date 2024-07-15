package com.sistemi.informativi.bean;

import java.util.Objects;

public class Course {

	private String code;

	private String title;

	private String location;

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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Course() {

	}

	public Course(String code, String title, String location) {

		this.code = code;
		this.title = title;
		this.location = location;
	}

	
	@Override
	public String toString() {
		return "Course [code=" + code + ", title=" + title + ", location=" + location + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, location, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(code, other.code) && Objects.equals(location, other.location)
				&& Objects.equals(title, other.title);
	}
	
	
	

}
