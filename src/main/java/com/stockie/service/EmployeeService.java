package com.stockie.service;

import java.util.List;

import com.stockie.model.Employee;

/**
 * @author Shameer Ahamed
 *
 */
public interface EmployeeService {
	
	public void saveEmployee(Employee employeeBean);

	public List<Employee> listEmployees();
	
	public Employee getEmployee(int id);
	
	public void deleteEmployee(int id);
}
