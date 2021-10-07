package com.pack.jdbc;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class JDBCExample {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please give the id of friend you want to delete: ");
		int user_id = in.nextInt();
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		Statement statement = null;
		String sqlQuery = "delete from friends_tb where id = ?";
		String sqlQuery1 = "Select * from friends_tb";
		
		connection = DatabaseUtility.getDBConnection();
		try {
			preparedStatement = connection.prepareStatement(sqlQuery);
			preparedStatement.setInt(1, user_id);
			int x = preparedStatement.executeUpdate();
			if(x>0) {
				System.out.println("DB is updated.");
			}else {
				System.out.println("Db is not updated.");
			}
			
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sqlQuery1);
			
			while(resultSet.next()) {
				System.out.print(resultSet.getString("id"));
				System.out.print("  |  " + resultSet.getString("name"));
				System.out.print("  |  " + resultSet.getString("address"));
				System.out.print("  |  " + resultSet.getString("password"));
				System.out.print("  |  " + resultSet.getString("phn_num") + "\n");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			System.out.println("\nThis is the finally block.");
			in.close();
			try {
				preparedStatement.close();
				statement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
