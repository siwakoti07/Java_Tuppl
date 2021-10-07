package com.pack.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCWithUpdate {
	
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement preparedstatement = null;
		
		String sqlQuery = "UPDATE friends_tb set name=? where id=?";
	
		connection = DatabaseUtility.getDBConnection();
		try {
			preparedstatement = connection.prepareStatement(sqlQuery);
			preparedstatement.setString(1, "Sujan");
			preparedstatement.setInt(2, 4);
			int x = preparedstatement.executeUpdate();
			
			if(x > 0) {
				System.out.println("The database is updated.");
			}
			else {
				System.out.println("No record is updated in DB");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			System.out.println("The statement in finally block.");
			try {
				preparedstatement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}	
	}
}
