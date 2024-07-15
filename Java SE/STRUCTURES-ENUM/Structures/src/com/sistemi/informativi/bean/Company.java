package com.sistemi.informativi.bean;

public class Company {

	private String businessName;

	private String vatNumber;

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getVatNumber() {
		return vatNumber;
	}

	public void setVatNumber(String vatNumber) {
		this.vatNumber = vatNumber;
	}

	public Company() {

	}

	public Company(String businessName, String vatNumber) {

		this.businessName = businessName;
		this.vatNumber = vatNumber;
	}

	
	@Override
	public String toString() {
		return "Company [businessName=" + businessName + ", vatNumber=" + vatNumber + "]";
	}
	


}
