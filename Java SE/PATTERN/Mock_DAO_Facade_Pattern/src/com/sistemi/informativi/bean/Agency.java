package com.sistemi.informativi.bean;

public class Agency {


    private String businessName;

    private String businessLocation;

    private String vatNumber;

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessLocation() {
        return businessLocation;
    }

    public void setBusinessLocation(String businessLocation) {
        this.businessLocation = businessLocation;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    public Agency(String businessName, String businessLocation, String vatNumber) {
        this.businessName = businessName;
        this.businessLocation = businessLocation;
        this.vatNumber = vatNumber;
    }

    @Override
    public String toString() {
        return "Agency{" +
                "businessName='" + businessName + '\'' +
                ", businessLocation='" + businessLocation + '\'' +
                ", vatNumber='" + vatNumber + '\'' +
                '}';
    }
}
