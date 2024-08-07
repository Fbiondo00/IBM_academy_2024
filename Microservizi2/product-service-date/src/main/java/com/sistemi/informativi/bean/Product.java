package com.sistemi.informativi.bean;

import java.sql.Date;

public class Product {

    private String code;

    private String name;

    private String origin;

    private Date date;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    protected Product(){}

    public Product(String code, String name, String origin, Date date) {
        this.code = code;
        this.name = name;
        this.origin = origin;
        this.date = date;
    }


}
