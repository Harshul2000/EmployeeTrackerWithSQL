package com.hdfc.dbcon;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
        
	public static void main(String[] args) {
		String z = " Delete from employee where eid =?";
		
		try {
			PreparedStatement ps = DbConnection.getDbConnection().prepareStatement(z);
		
			
			ps.setInt(1,1103);
			
			ps.execute();
			
			System.out.println("Success");
			
		}catch (SQLException e) {
			e.printStackTrace();
		
		
	}
}
}