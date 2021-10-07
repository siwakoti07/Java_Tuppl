package com.pack.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pack.util.DatabaseUtility;

public class LoginServiceImpl implements LoginService {

	@Override
	public boolean login(String un, String up) {
		boolean isValidStudent = false;
		try {
			String selectSql = "select * from friends_tb where name=? and password=?";
			// call getDBConnection() method statically from DatabaseUtility
			// creating DB connection
			Connection connection = DatabaseUtility.getDBConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(selectSql);
			preparedStatement.setString(1, un);
			preparedStatement.setString(2, up);

			ResultSet rs = preparedStatement.executeQuery();
			if (rs.next()) {
				System.out.println("Right credentials !!!");
				isValidStudent = true;
			} else {
				System.out.println("wrong credentials !!!");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isValidStudent;
	}

}

