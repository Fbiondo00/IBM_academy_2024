package com.sistemi.informativi.controller;

import com.sistemi.informativi.bean.Product;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;

@RestController
@RequestMapping("/rest/api/products/date")
public class ProductDateController {

    @PostMapping
    public @ResponseBody  Object addDateProduct(@RequestBody Product product){

        Product receivedProduct = product;

        receivedProduct.setDate(new Date(System.currentTimeMillis()));
        return receivedProduct;

    }


}
