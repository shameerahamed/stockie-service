package com.stockie.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stockie.dao.EmployeeDao;
import com.stockie.model.Employee;
import com.stockie.service.EmployeeService;
import com.stockie.service.StockieAbstractService;

/**
 * @author Shameer Ahamed
 *
 */
@Service("employeeService")
public class EmployeeServiceImpl extends StockieAbstractService implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	public void saveEmployee(Employee employee) {
		employeeDao.saveEmployee(employee);
	}
	
	public List<Employee> listEmployees() {
		return employeeDao.listEmployees();
	}

	public Employee getEmployee(int empid) {
		return employeeDao.getEmployee(empid);		
	}
	
	public void deleteEmployee(int empId) {
		employeeDao.deleteEmployee(empId);
	}

}
