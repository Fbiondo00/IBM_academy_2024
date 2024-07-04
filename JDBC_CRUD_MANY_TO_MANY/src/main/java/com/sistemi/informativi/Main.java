package com.sistemi.informativi;

import com.sistemi.informativi.dao.FacadeDAO;
import com.sistemi.informativi.dao.FacadeDAOImpl;
import com.sistemi.informativi.dto.CustomerDTO;
import com.sistemi.informativi.dto.CustomerProductDTO;
import com.sistemi.informativi.dto.ProductDTO;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        FacadeDAO facadeDAO = new FacadeDAOImpl();
        Connection con = facadeDAO.getConnection();

       int id1 =  facadeDAO.addCustomer(new CustomerDTO("scemo", "scemo@gmail.com"));
       //int id2 = facadeDAO.addCustomer(new CustomerDTO("alessio", "abuonomo@gmail.com"));

        int id3 = facadeDAO.addProduct(new ProductDTO("Flavio",00.0F));
       // int id4 = facadeDAO.addProduct(new ProductDTO("TV",2000.8F));


        facadeDAO.addCustomerProduct(new CustomerProductDTO(id1,id3));
       // facadeDAO.addCustomerProduct(new CustomerProductDTO(id1,id4));
        //facadeDAO.addCustomerProduct(new CustomerProductDTO(id2,id3));
       // facadeDAO.addCustomerProduct(new CustomerProductDTO(id2,id4));


        facadeDAO.getCustomersNameByProduct(id3).forEach(System.out::println);
        facadeDAO.closeConnection();


    }
}