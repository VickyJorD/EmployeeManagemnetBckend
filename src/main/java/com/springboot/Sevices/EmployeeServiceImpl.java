package com.springboot.Sevices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.Repository.EmployeeRepository;
import com.springboot.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	
	@Override
	public Employee saveEmploye(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}



	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

}
