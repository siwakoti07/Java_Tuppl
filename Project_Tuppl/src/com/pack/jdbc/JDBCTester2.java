package com.pack.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTester2 {
	public static void main(String[] args) {

		try {
			// 1) load the Mysql driver class
			// Class.forName("com.mysql.jdbc.Driver"); // Till mysql 5.x
			Class.forName("com.mysql.cj.jdbc.Driver"); // mysql 8.x

			// 2) Creating connection String.also mention DB username , DB password , and DB
			// name
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment3", "root",
					"1996Paribesh");

			// 3) create statements
			Statement statement = connection.createStatement();

			// 4) generate result set
			ResultSet resultSet = statement.executeQuery("select * from actor where id=555555");

			// 5) checking data in ResultSet by using next() method
			if (resultSet.next()) {
				System.out.println("record is present in Db");
				//String fname = resultSet.getString("fname");
				String lname = resultSet.getString("lname");
				System.out.println("Actor's first name : " + resultSet.getString("fname"));
				System.out.println("Actor's last name : " + lname);
			} else {
				System.out.println("No record found in Db");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally block !!!");
		}
	}

}
