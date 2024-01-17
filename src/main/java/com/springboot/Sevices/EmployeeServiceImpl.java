package com.springboot.Sevices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
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
	public Optional<Employee> getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id);
	}



	@Override
	public Employee updateEmployee(int id, Employee employee) {
	    Employee employeeToUpdate = employeeRepository.findById(id).orElseThrow();
	    employeeToUpdate.setUsername(employee.getUsername());  // Update the username
	    employeeToUpdate.setPassword(employee.getPassword());  // Update the password
	    employeeToUpdate.setRole(employee.getRole());          // Update the role
	    return employeeRepository.save(employeeToUpdate);
	}




	@Override
	public void deleteEmployee(int id) {
			employeeRepository.deleteById(id);
	}



	@Override
	public List<Employee> getAllEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.findAll(Sort.by(Sort.Direction.DESC,"id"));
	}


}
