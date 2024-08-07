package com.sistemi.informativi.service;

import com.sistemi.informativi.entity.Product;
import com.sistemi.informativi.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service

public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
}
