package com.tcs.jdbc_callable_statement_crud.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class CustomerConnection {

	public static Connection getCustomerConnection() {

		try {
			// step1: load/register driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			// step2: create connection

			return DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-a5", "root", "root");

		} catch (SQLException e) {

			e.printStackTrace();
			return null;
		}
	}
}
