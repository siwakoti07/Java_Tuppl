package com.pack.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCWithAllRecords{
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		String sqlQuery = "select * from friends_tb"; // ? => place holder
		try {
			connection = DatabaseUtility.getDBConnection();
			preparedStatement = connection.prepareStatement(sqlQuery);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				System.out.print(resultSet.getInt("id"));
				System.out.print(" | " + resultSet.getString("name"));
				System.out.print(" | " + resultSet.getString("address"));
				System.out.print(" | " + resultSet.getString("password") + "\n");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			System.out.println("\nfinally block !!!");
			try {
				connection.close();
				preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
