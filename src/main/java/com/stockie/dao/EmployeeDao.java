package com.stockie.dao;

import java.util.List;

import com.stockie.model.Employee;

/**
 * @author Shameer Ahamed
 *
 */
public interface EmployeeDao {
	
	public void saveEmployee(Employee employee);

	public List<Employee> listEmployees();
	
	public Employee getEmployee(int empid);
	
	public void deleteEmployee(int empId);
}
