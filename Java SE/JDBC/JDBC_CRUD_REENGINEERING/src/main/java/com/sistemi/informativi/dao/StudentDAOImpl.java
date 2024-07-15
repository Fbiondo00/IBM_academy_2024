package com.sistemi.informativi.dao;

import com.sistemi.informativi.connection.ConnectionManager;
import com.sistemi.informativi.dto.StudentDTO;
import com.sistemi.informativi.sql.SqlScript;
import com.sistemi.informativi.vo.StudentVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDAOImpl implements StudentDAO{



    /**
     *
     * @param studentDTO contiene le informazioni dello student da sostituire ai placeholder dello script anonimo
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    @Override
    public void addStudent(StudentDTO studentDTO) throws SQLException, ClassNotFoundException {

        /*
        inizializzazione di un PreparedStatement tramite
        invocazione alla Classe ConnectionManager
        Quando il Main invocherà questo metodo gli passerà in input il
        seguente script sql anonimo:
        "insert unto student(first_name,last_name,age)values(?,?,?);
         */
        PreparedStatement ps = ConnectionManager.getPreparedStatement(SqlScript.sqlStudentInsert);
        ps.setString(1, studentDTO.getFirsName());
        ps.setString(2, studentDTO.getLastName());
        ps.setInt(3, studentDTO.getAge());
        // script sql concreto

        // operazione di sincronizzazione con il database
        ps.executeUpdate();

    }

    /**
     *
     * @param studentDTO contiene le informazioni aggiornate dello student da modificare sul db
     * @param id rappresenta la primary key relativa allo student da modificare
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    @Override
    public void updateStudent(StudentDTO studentDTO, int id) throws SQLException, ClassNotFoundException {

        //"update student set first_name=?,last_name=?,age=? where id=?"
        PreparedStatement ps = ConnectionManager.getPreparedStatement(SqlScript.sqlStudentUpdate);
        ps.setString(1, studentDTO.getFirsName());
        ps.setString(2, studentDTO.getLastName());
        ps.setInt(3, studentDTO.getAge());
        ps.setInt(4, id);
        // script sql concreto
        ps.executeUpdate();

    }

    /**
     *
     * @param id valore della chiave primaria rispetto al quale effettuare la cancellazione dello specifico student
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    @Override
    public void removeStudent(int id) throws SQLException, ClassNotFoundException {

        // delete from student where id=?
        PreparedStatement ps = ConnectionManager.getPreparedStatement(SqlScript.sqlStudentDelete);
        ps.setInt(1, id);
        // script concreto

        ps.executeUpdate();

    }

    /**
     *
     * @return una ArrayList contenente tanti Oggetti StudentVO (Serializzati) per quanti sono gli Oggetti del ResultSet (Non Serializzati)
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    @Override
    public ArrayList<StudentVO> getStudents() throws SQLException, ClassNotFoundException {

        /*
        Inizializzazione di una ArrayList che conterrà reference ad
        Oggeti StudentVO pe garantire SERIALIZZAZIONE
         */
        ArrayList<StudentVO> students = new ArrayList<StudentVO>();

        StudentVO studentVO = null;

    /*
    Inizializzazione di una Struttura Dati JDBC ResultSet contenente tante
    locazioni di memoria per quanti sono i record recuperati dal database
    nella query di lettura

    Nativamente le reference contenute nelle locazioni di memoria
    di un ResultSet non referenziano Oggetti Serializable
    Viene cnsiderata tua best practice lavorare anche in letttura
    con Oggetti Serializable
     */
    ResultSet rs = ConnectionManager.getResultSet(SqlScript.sqlRead);

    while(rs.next()){

        /*
        Estrapolazione del contenuto di ogni Oggetto
        del ResultSet (non serializzato di default)
        e relativa copia in un Oggetto VO (serializzato)
         */
        studentVO = new StudentVO(
                rs.getInt("id"),
                rs.getString("first_name"),
                rs.getString("last_name"),
                rs.getInt("age"));

        /*
        popolamento dell'ArrayList students con tutti gli
        Oggetti StudentVO
         */
        students.add(studentVO);

    }

    return students;

    }
}
