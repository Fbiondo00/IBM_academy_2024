package com.sistemi.informativi.dao;

import com.sistemi.informativi.dto.CustomerProductDTO;

import java.sql.SQLException;

public interface CustomerProductDAO {
    public void addCustomerProduct(CustomerProductDTO customerProductDTO) throws ClassNotFoundException, SQLException;

}
