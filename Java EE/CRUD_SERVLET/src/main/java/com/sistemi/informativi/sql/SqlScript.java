package com.sistemi.informativi.sql;

public interface SqlScript {
	
	static String sqlInsertStudent = "insert into student(first_name,last_name,age) values (?,?,?)";

}
