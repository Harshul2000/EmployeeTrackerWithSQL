package com.hdfc.dbcon;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
	
	public static void main(String[] args) {
		String q ="Insert into employee values(?,?,?,?,?,?,?)";
		
		PreparedStatement ps;
		try {
			ps = DbConnection.getDbConnection().prepareStatement(q);
		
		
		ps.setInt(1,10);
		ps.setString(2, "manish");
		ps.setString(3, "IT");
		ps.setString(4,"Google");
		ps.setInt(5, 10000);
		ps.setString(6,"Manager");
		ps.setString(7,"Male");
		
		ps.execute();
		
		System.out.println("Insertion Successful");
		
		
	}catch (SQLException e) {
		e.printStackTrace();
	}

	}
	
}
