package com.stockie.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stockie.dao.CustomerDao;
import com.stockie.model.Customer;
import com.stockie.service.CustomerService;
import com.stockie.service.StockieAbstractService;

@Service("customerService")
public class CustomerServiceImpl extends StockieAbstractService implements CustomerService {

	@Autowired
	CustomerDao customerDao;
	
	public void saveCustomer(Customer customer) {
		customerDao.saveCustomer(customer);
	}

	public List<Customer> listCustomers() {
		return customerDao.listCustomers();
	}

	public Customer getCustomer(int custId) {
		Customer customer = customerDao.getCustomer(custId);
		return customer;
	}

	public void deleteCustomer(int custId) {
		customerDao.deleteCustomer(custId);
	}

}
