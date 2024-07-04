package com.sistemi.informativi.connection;

import java.sql.*;

public class ConnectionManager implements DbParameters{

    private static Connection con;

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        if (con == null) {
            Class.forName(dbDriver);
            con= DriverManager.getConnection(dbUrl,dbUser,dbPass);
        }
        return con;
    }

    public static PreparedStatement getPreparedStatement(String sql) throws SQLException{
        PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        return ps;

    }
    public static ResultSet getResultSet(String sql) throws SQLException, ClassNotFoundException {
        return getConnection().createStatement().executeQuery(sql);
    }

    public static void closeConnection() throws SQLException, ClassNotFoundException {
        getConnection().close();
    }
}