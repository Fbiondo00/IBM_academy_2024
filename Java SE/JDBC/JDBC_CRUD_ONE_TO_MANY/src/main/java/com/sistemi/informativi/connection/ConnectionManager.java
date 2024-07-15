package com.sistemi.informativi.connection;

import java.sql.*;

public class ConnectionManager implements DbParameters {

    private static Connection con;

    /**
     * @return una connessione che fa riferimento ad una singola istanza (pattern Singleton)
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static Connection getConnection() throws ClassNotFoundException, SQLException {

        if (con == null) {

            Class.forName(dbDriver);

            con = DriverManager.getConnection(dbUrl, dbUser, dbPass);


        }

        return con;

    }

    /**
     * @param sql script che conterrà la logica di una operazione di CRUD (insert,update,delete)
     * @return una reference di tipo PreparedStatent utile ad eseguire una operazione di CRUD (insert,update,delete)
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static PreparedStatement getPreparedStatement(String sql) throws SQLException, ClassNotFoundException {


        /*
        stiamo usando una versione del metodo prepareStatement che è in grado
        di memorizzare il valore della chiave primaria inserita sul database
         */
        return getConnection().prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);


    }

    /**
     * @param sql script che conterrà la logica di una operazione di lettura
     * @return una struttura JDBC ResultSet contenente i risultati di una operazione di lettura eseguita sul db
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static ResultSet getResultSet(String sql) throws SQLException, ClassNotFoundException {

        return getConnection().createStatement().executeQuery(sql);
    }

    /**
     * metodo che chiude una connessione precedentemente aperta
     *
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static void closeConnection() throws SQLException, ClassNotFoundException {

        getConnection().close();

    }

}