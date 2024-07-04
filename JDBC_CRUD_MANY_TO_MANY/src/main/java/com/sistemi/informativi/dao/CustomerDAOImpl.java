package com.sistemi.informativi.dao;

import com.sistemi.informativi.connection.ConnectionManager;
import com.sistemi.informativi.dto.CustomerDTO;
import com.sistemi.informativi.sql.SqlScript;
import com.sistemi.informativi.vo.CustomerVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerDAOImpl implements CustomerDAO{
    @Override
    public int addCustomer(CustomerDTO customerDTO) throws ClassNotFoundException, SQLException {
        int id = -1;

        PreparedStatement ps = ConnectionManager.getPreparedStatement(SqlScript.sqlCustomerInsert);
        ps.setString(1,customerDTO.getName());
        ps.setString(2,customerDTO.getEmail());
        ps.executeUpdate();

        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next())
            id = rs.getInt(1);
        return id;
    }

    @Override
    public ArrayList<CustomerVO> getCustomersNameByProduct(int productId) throws ClassNotFoundException, SQLException {
        ArrayList<CustomerVO> customers = new ArrayList<>();
        CustomerVO customerVO= null;
        PreparedStatement ps = ConnectionManager.getPreparedStatement(SqlScript.sqlCustomerNameByProduct);
        ps.setInt(1,productId);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
                customerVO = new CustomerVO(rs.getString("name"));
                customers.add(customerVO);
                }
        return customers;
    }
}
