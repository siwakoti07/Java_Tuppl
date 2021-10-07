package com.pack.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCWithDelete {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		String driverName = "com.mysql.cj.jdbc.Driver"; // mysql 8.x
		String dbUrl = "jdbc:mysql://localhost:3306/myschema_db";
		String dbUserName = "root";
		String dbPassword = "1996Paribesh";
		String sqlQuery = "delete from friends_tb where id=?"; // ? => place holder
		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);

			preparedStatement = connection.prepareStatement(sqlQuery);
			preparedStatement.setInt(1, 1); //passing 555555 to the first place holder
			//preparedStatement.setString(2, "Rajesh"); //passing 'Rajesh' to the second place holder

			//ResultSet resultSet = preparedStatement.executeQuery();
			preparedStatement.executeUpdate();
			System.out.println("The delet query is executed.");

			/*if (resultSet.next()) {
				System.out.println("record is present in Db");
				String fname = resultSet.getString("fname");
				String lname = resultSet.getString("lname");
				System.out.println("Actor's first name : " + fname);
				System.out.println("Actor's last name : " + lname);
			} else {
				System.out.println("No record found in Db");
			}*/
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally block !!!");
			try {
				connection.close();
				preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
