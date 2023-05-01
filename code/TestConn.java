package com.hdfc.dbcon;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConn {
	
	public static void main(String[] args) throws SQLException{
		
		String q ="Select * from employee";
		
		Statement statement = DbConnection.getDbConnection().createStatement();
		
		ResultSet rs = statement.executeQuery(q);
		
		if(rs.next()) {
			System.out.println(rs.getString("full_name"));
		}
		
	}

}
