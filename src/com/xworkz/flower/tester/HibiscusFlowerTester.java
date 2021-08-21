package com.xworkz.flower.tester;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static com.xworkz.jdbc.constant.JdbcConstant.*;

public class HibiscusFlowerTester {

	public static void main(String[] args) {
		String fnqOfDriverImpl = "com.mysql.cj.jdbc.Driver";
		Connection connection = null;
		try {
			Class.forName(fnqOfDriverImpl);
			connection = DriverManager.getConnection(url, user, password);
			String query = "INSERT INTO flower_table VALUES (10, 'Hibiscus', 'red',10,false,'pooja','odourless','pooja purpose',10,7)";
			Statement statement = connection.prepareStatement(query);
			statement.execute(query);
			System.out.println(connection);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}