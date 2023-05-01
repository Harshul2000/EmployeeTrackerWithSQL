package com.hdfc.dbcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	
	public static Connection getDbConnection() throws  SQLException{

	//information about database
	String url = "jdbc:mysql://127.0.0.1:3306/student_tracker_db";
	String user = "root";
	String pass = "root";
	
	Connection conn = DriverManager.getConnection(url,user,pass);
	
	return conn;
	}
	
}
