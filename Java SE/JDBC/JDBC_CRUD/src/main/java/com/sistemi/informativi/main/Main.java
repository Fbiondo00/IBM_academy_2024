package com.sistemi.informativi.main;

import java.sql.*;

public class Main {

    private static final String dbDriver = "com.mysql.cj.jdbc.Driver";
    private static final String dbUrl = "jdbc:mysql://localhost:3306/openjob";
    private static final String dbUser = "root";
    private static final String dbPass = "";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // script anonimo in quamto contiene palaceholder(?) da concretizzare successiovamente
        String sqlStudentInsert = "insert into student(first_name,last_name,age) values(?,?,?)";
        String sqlStudentUpdate = "update student set first_name=?,last_name=?,age=? where id=?";
        String sqlStudentDelete = "delete from student where id=?";
        String sqlStudentRead =   "select * from student";


       // STEP 1 : indicazione del driver di connessione
        Class.forName(dbDriver);

        // STEP 2: apertura connessione al database
        Connection con = DriverManager.getConnection(dbUrl,dbUser,dbPass);

        // STEP 3 : OPERAZIONI DI CRUD
        // STEP 3.1 --->>INSERIMENTO NELLA TABELLA student del database openjob
        /*
        Il metodo prepareStatement accetta in input
        uno script anonimo (con parametri indefiniti, placeholder)
        che successivamente dovranno essere concretizzati
        "insert into student(first_name,last_name,age) values(?,?,?)"
         */
        PreparedStatement psInsert = con.prepareStatement(sqlStudentInsert);
        /*
        L'API PreparedStatement contiene un metodo di set
        per ogni possibile tipo dei campi di un database
        relazionale
         */
        psInsert.setString(1,"Giovanni");
        psInsert.setString(2,"Carlini");
        psInsert.setInt(3,29);
       // "insert into student(first_name,last_name,age) values('Giovanni','Carlini',29)"

        /*
        L'invocazione del metodo executeUpdate è necessaria per
        eseguire realmenete le operazioni implementate prima in
        quanto rappresenta l'operazione di COMMIT verso il database
        L'invocazione di tale metodo è sempre necessaria dopo
        operazioni di trasferimento dall'applicazione al database
        ovvero dopo operazioni di inserimento, aggiornamento e
        cancellazione
         */
        psInsert.executeUpdate();
        // END STEP 3.1 INSERIMENTO SULLA TABELLA student del database openjob


        // STEP 3.2 update di un record
        PreparedStatement psUpdate = con.prepareStatement(sqlStudentUpdate);
        //"update student set first_name=?,last_name=?,age=? where id=?";
        psUpdate.setString(1,"Giada");
        psUpdate.setString(2,"Proto");
        psUpdate.setInt(3,29);
        psUpdate.setInt(4,4);
        //"update student set first_name='Giada',last_name='Proto',age=29 where id=4";

        psUpdate.executeUpdate();
        // END STEP 3.2 update

        // STEP 3.3 CANCELLAZIONE DI 1 SINGOLO RECORD
        PreparedStatement psDelete = con.prepareStatement(sqlStudentDelete);
        // delete from student where id=?
        psDelete.setInt(1,2);
        // delete from student where id=2

        psDelete.executeUpdate();
        // END STEP 3.3 CANCELLAZIONE

        // STEP 3.4 LETTURA INTEGRALE
        /*
        Inizializzazione di uno Statement
        che non contiene il risultato della
        lettura
         */
        Statement stmt = con.createStatement();
        /*
        Il ResultSet è una struttura dati JDBC che
        contiene le informazioni recuperate in lettura
        ed è speculare ai record della tabella
         */
        ResultSet rs = stmt.executeQuery(sqlStudentRead);
        while (rs.next()){

            System.out.println
                    (rs.getInt("id") + " " +
                    rs.getString("first_name") + " " +
                    rs.getString("last_name") + " " +
                    rs.getInt("age"));

        }

    }
}