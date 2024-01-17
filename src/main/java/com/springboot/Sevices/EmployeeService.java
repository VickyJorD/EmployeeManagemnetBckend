package com.springboot.Sevices;

import java.util.List;
import java.util.Optional;

import com.springboot.model.Employee;

public interface EmployeeService {

	public Employee saveEmploye(Employee employee);
	
	public List<Employee> getAllEmployee(Employee employee);
	public Optional<Employee> getEmployeeById(int id);
	public Employee updateEmployee(int id,Employee employee);
	void deleteEmployee(int id);
}
