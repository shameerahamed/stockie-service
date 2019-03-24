package com.stockie.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.stockie.dao.EmployeeDao;
import com.stockie.dao.StockieAbstractDao;
import com.stockie.model.Employee;

/**
 * @author Shameer Ahamed
 *
 */
@Repository("employeeDao")
public class EmployeeDaoImpl extends StockieAbstractDao implements EmployeeDao {
	
	public void saveEmployee(Employee employee) {
		getSession().saveOrUpdate(employee);
	}

	@SuppressWarnings("unchecked")
	public List<Employee> listEmployees() {
		return (List<Employee>) getSession().createCriteria(Employee.class).list();
	}

	public Employee getEmployee(int empid) {
		return (Employee) getSession().get(Employee.class, empid);
	}

	public void deleteEmployee(int empid) {
		getSession().createQuery("DELETE FROM Employee WHERE empId = "+empid).executeUpdate();
	}

}
