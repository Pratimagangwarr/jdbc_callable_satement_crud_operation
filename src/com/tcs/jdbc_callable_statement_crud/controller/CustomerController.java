package com.tcs.jdbc_callable_statement_crud.controller;

import com.tcs.jdbc_callable_statement_crud.dao.CustomerDao;
import com.tcs.jdbc_callable_statement_crud.entity.Customer;

public class CustomerController {
	public static void main(String[] args) {
		CustomerDao customerDao = new CustomerDao();

		Customer customer = new Customer(555, "ewfdver", "sfergerr@gmail.com", "delhi");

		Customer customer2 = customerDao.saveCustomerDao(customer);

		System.out.println(customer2 + "customer2 value");

	}

}
