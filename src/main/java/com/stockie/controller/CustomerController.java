package com.stockie.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.stockie.model.Customer;
import com.stockie.service.CustomerService;

@Controller
@CrossOrigin
public class CustomerController {
	private static final Logger logger = Logger.getLogger("CustomerController");
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value="/customer", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Customer>> getAllCustomers() {
		List<Customer> customers = customerService.listCustomers();
		
		if (customers == null || customers.isEmpty()) {
			return new ResponseEntity<List<Customer>>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
	}
	
	@RequestMapping(value="/customer/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Customer> getCustomer(@PathVariable("id") int id) {
		logger.info("custId :: " + id);
		Customer customer = customerService.getCustomer(id);
		
		if (customer == null) {
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/customer", method = RequestMethod.POST)
	public ResponseEntity<Void> createCustomer(@RequestBody Customer customer) {
		try {
			logger.info("saveCustomer");
			customerService.saveCustomer(customer);
			
			return new ResponseEntity<Void>(HttpStatus.CREATED);	
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("Error in processing :: " + e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@RequestMapping(value = "/customer/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Customer> deleteCustomer(@PathVariable("id") int id) {
		logger.info("Fetching & Deleting Customer with id " + id);
		
		try {
			Customer customer = customerService.getCustomer(id);
	        if (customer == null) {
	        	logger.info("Unable to delete. Customer with id " + id + " not found");
	            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
	        }
	 
	        customerService.deleteCustomer(id);
	        return new ResponseEntity<Customer>(HttpStatus.NO_CONTENT);
		}
		catch(Exception e) {
			e.printStackTrace();
			logger.info("error :: " + e.getMessage());
			return new ResponseEntity<Customer>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
    } 
	
}
