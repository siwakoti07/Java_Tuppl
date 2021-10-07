package com.pack.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTester {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		String sqlQuery = "select * from friends_tb";
		connection = DatabaseUtility.getDBConnection();
		try {
			preparedStatement = connection.prepareStatement(sqlQuery);
			ResultSet resultset = preparedStatement.executeQuery();
			
			while(resultset.next()) {
				System.out.print(resultset.getString("id"));
				System.out.print("\t"+resultset.getString("name"));
				System.out.print("\t"+resultset.getString("address"));
				System.out.print("\t"+resultset.getString("password"));
				System.out.print("\t"+resultset.getString("phn_num")+"\n");
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			System.out.println("\nFinally block!!");
			try {
				connection.close();
				preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}

	}

}
