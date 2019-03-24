package com.stockie.service;

import java.util.List;

import com.stockie.model.Customer;

public interface CustomerService {
	public void saveCustomer(Customer customer);

	public List<Customer> listCustomers();
	
	public Customer getCustomer(int id);
	
	public void deleteCustomer(int id);
}
