package com.sistemi.informativi.dao;

import com.sistemi.informativi.connection.ConnectionManager;
import com.sistemi.informativi.dto.CustomerDTO;
import com.sistemi.informativi.dto.CustomerProductDTO;
import com.sistemi.informativi.dto.ProductDTO;
import com.sistemi.informativi.vo.CustomerVO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class FacadeDAOImpl implements FacadeDAO{

    CustomerDAO customerDAO = new CustomerDAOImpl();
    ProductDAO productDAO = new ProductDAOImpl();
    CustomerProductDAO customerProductDAO = new CustomerProductDAOImpl();

    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException {

        return ConnectionManager.getConnection();
    }

    @Override
    public int addCustomer(CustomerDTO customerDTO) throws ClassNotFoundException, SQLException {

        return customerDAO.addCustomer(customerDTO);
    }

    @Override
    public ArrayList<CustomerVO> getCustomersNameByProduct(int productId) throws ClassNotFoundException, SQLException {

        return customerDAO.getCustomersNameByProduct(productId);
    }

    @Override
    public int addProduct(ProductDTO productDTO) throws ClassNotFoundException, SQLException {

        return productDAO.addProduct(productDTO);
    }

    @Override
    public void addCustomerProduct(CustomerProductDTO customerProductDTO) throws ClassNotFoundException, SQLException {

        customerProductDAO.addCustomerProduct(customerProductDTO);
    }

    @Override
    public void closeConnection() throws SQLException, ClassNotFoundException {

        ConnectionManager.closeConnection();
    }
}