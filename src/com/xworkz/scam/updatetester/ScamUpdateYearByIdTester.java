package com.xworkz.scam.updatetester;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ScamUpdateYearByIdTester {

	public static void main(String[] args) {

		String username = "root";
		String password = "Anusha@1";
		String url = "jdbc:mysql://localhost:3306/anushasri_ks";

		try (Connection connection = DriverManager.getConnection(url, username, password)) {
			Statement statement = connection.createStatement();
			String query = "UPDATE scam SET s_year = 2012 WHERE s_id = 12";
			statement.execute(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}