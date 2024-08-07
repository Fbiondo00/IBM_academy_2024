package com.sistemi.informativi.controller;

import com.sistemi.informativi.entity.Product;
import com.sistemi.informativi.service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/api/products")
public class ProductController {



    private ProductService productService;
    private RestTemplate restTemplate;

    public ProductController(ProductService productService, RestTemplate restTemplate) {
        this.productService = productService;
        this.restTemplate = restTemplate;
    }

    @PostMapping
    public Object saveAndSendProduct(@RequestBody Product product) {
        String apiUrl = "http://microservice2:8301/rest/api/products/date";

        productService.saveProduct(product);

        return restTemplate.postForObject(apiUrl, product, Object.class);
    }
}
