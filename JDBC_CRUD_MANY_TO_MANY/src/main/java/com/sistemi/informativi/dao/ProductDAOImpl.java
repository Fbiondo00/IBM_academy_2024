package com.sistemi.informativi.dao;

import com.sistemi.informativi.connection.ConnectionManager;
import com.sistemi.informativi.dto.ProductDTO;
import com.sistemi.informativi.sql.SqlScript;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDAOImpl implements ProductDAO{
    @Override
    public int addProduct(ProductDTO productDTO) throws ClassNotFoundException, SQLException {
        int id = -1;

        PreparedStatement ps = ConnectionManager.getPreparedStatement(SqlScript.sqlProductInsert);
        ps.setString(1,productDTO.getName());
        ps.setFloat(2,productDTO.getPrice());
        ps.executeUpdate();

        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next())
            id = rs.getInt(1);
        return id;
    }
}
