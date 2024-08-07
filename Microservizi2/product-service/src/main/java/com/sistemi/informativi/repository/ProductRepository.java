package com.sistemi.informativi.repository;


import com.sistemi.informativi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {

}
