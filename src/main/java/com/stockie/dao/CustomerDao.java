package com.stockie.dao;

import java.util.List;

import com.stockie.model.Customer;

public interface CustomerDao {
	public void saveCustomer(Customer customer);

	public List<Customer> listCustomers();
	
	public Customer getCustomer(int custId);
	
	public void deleteCustomer(int custId);
}
