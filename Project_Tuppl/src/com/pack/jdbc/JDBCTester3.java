package com.pack.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTester3 {
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		String driverName = "com.mysql.cj.jdbc.Driver"; // mysql 8.x
		String dbUrl = "jdbc:mysql://localhost:3306/assignment3";
		String dbUserName = "root";
		String dbPassword = "1996Paribesh";
		String sqlQuery = "select * from actor where id=555555";
		try {
			Class.forName(driverName); 
			connection = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sqlQuery);
			if (resultSet.next()) {
				System.out.println("record is present in Db");
				String fname = resultSet.getString("fname");
				String lname = resultSet.getString("lname");
				System.out.println("Actor fname : " + fname);
				System.out.println("Actor lname : " + lname);
			} else {
				System.out.println("No record found in Db");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally block !!!");
			try {
				connection.close();
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}

