package com.xworkz.scam.findtester;

import static com.xworkz.jdbc.constant.JdbcConstant.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TotalScamTester {

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection(url, user, password)) {
			String query = "SELECT count(s_id) FROM scam";
			Statement statement = connection.createStatement();
			statement.execute(query);
			connection.commit();
			ResultSet resultSet = statement.getResultSet();

			while (resultSet.next()) {
				int count = resultSet.getInt(1);
				System.out.println("Total Scams : " + count);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
