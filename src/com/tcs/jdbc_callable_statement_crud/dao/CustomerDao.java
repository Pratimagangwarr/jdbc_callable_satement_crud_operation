package com.tcs.jdbc_callable_statement_crud.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.tcs.jdbc_callable_statement_crud.connection.CustomerConnection;
import com.tcs.jdbc_callable_statement_crud.entity.Customer;

public class CustomerDao {
	Connection connection = CustomerConnection.getCustomerConnection();

	public Customer saveCustomerDao(Customer customer) {
		try {
			CallableStatement call = connection.prepareCall("call saveCustomerDetails( ?, ?, ?, ?)");
			call.setInt(1, customer.getId());
			call.setString(2, customer.getName());
			call.setString(3, customer.getEmail());
			call.setString(4, customer.getAddress());

			int a = call.executeUpdate();
			System.out.println(a + "no. of rows affected");

			return customer;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;

		}

	}
}
