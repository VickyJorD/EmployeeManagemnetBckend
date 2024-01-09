package com.springboot.Sevices;

import java.util.List;

import com.springboot.model.Employee;

public interface EmployeeService {

	public Employee saveEmploye(Employee employee);
	
	public List<Employee> getAllEmployee();
}
