package com.pack.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtility {
	
	static String driverName = "com.mysql.cj.jdbc.Driver"; // mysql 8.x
	static String dbUrl = "jdbc:mysql://localhost:3306/myschema_db";
	static String dbUserName = "root";
	static String dbPassword = "1996Paribesh";
	
	static Connection connection = null;
	
	public static Connection getDBConnection() {
		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}		
}

