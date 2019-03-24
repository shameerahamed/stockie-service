package com.stockie.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stockie.dao.CustomerDao;
import com.stockie.dao.StockieAbstractDao;
import com.stockie.model.Customer;

/**
 * @author ShameerAhamed
 *
 */
@Repository ("customerDao")
public class CustomerDaoImpl extends StockieAbstractDao implements CustomerDao{

	public void saveCustomer(Customer customer) {
		persist(customer);
	}

	public List<Customer> listCustomers() {
		return (List<Customer>) getSession().createCriteria(Customer.class).list();
	}

	public Customer getCustomer(int custId) {
		return (Customer) getSession().get(Customer.class, custId);
	}

	public void deleteCustomer(int custId) {
		getSession().createQuery("DELETE FROM Customer WHERE cust_id = "+custId).executeUpdate();		
	}

}
