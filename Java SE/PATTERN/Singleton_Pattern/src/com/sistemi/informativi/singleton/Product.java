package com.sistemi.informativi.singleton;

public class Product {

    // DI ISTANZA
    private String name;

    // DI ISTANZA
    private float price;

    // DI CLASSE
    private static Product product;

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    private Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public static Product getProduct(){

        if (product==null){

            product = new Product("productX",1765.89f);
        }

        return product;

    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
