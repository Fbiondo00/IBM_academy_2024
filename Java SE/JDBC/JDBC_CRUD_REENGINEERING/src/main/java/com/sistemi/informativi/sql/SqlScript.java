package com.sistemi.informativi.sql;

public interface SqlScript {

    public static String sqlStudentInsert = "insert into student(first_name,last_name,age) values(?,?,?)";

    public static String sqlStudentUpdate ="update student set first_name=?,last_name=?,age=? where id=?";

    public static String sqlStudentDelete = "delete from student where id=?";

    public static String sqlRead = "select * from student";

}
