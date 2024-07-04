package com.sistemi.informativi.dao;

import com.sistemi.informativi.dto.ProductDTO;

import java.sql.SQLException;

public interface ProductDAO {
    public int addProduct(ProductDTO productDTO) throws ClassNotFoundException, SQLException;

}
