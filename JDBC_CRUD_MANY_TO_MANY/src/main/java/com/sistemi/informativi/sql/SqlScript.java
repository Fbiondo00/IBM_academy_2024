package com.sistemi.informativi.sql;

public interface SqlScript {

    static final String sqlCustomerInsert = "insert into customer (name, email) values (?, ?)";
    static final String sqlProductInsert = "insert into product (name, price) values (?, ?)";
    static final String sqlJoinInsert = "insert into customer_product(customer_id, product_id) values (?, ?)";
    static final String sqlCustomerNameByProduct = """
            select customer.name from customer
            JOIN customer_product ON customer.id=customer_product.customer_id
            JOIN product ON product.id=customer_product.product_id
            where product.id=?""";

}
