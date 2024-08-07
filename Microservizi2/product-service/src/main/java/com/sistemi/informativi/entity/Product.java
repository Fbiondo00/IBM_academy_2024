package com.sistemi.informativi.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Product implements Serializable {

    @Id
    private String code;

    private String name;

    private String origin;

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

    protected Product(){}

    public Product(String code, String name, String origin) {
        this.code = code;
        this.name = name;
        this.origin = origin;
    }

}
