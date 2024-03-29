package com.springboot.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Sevices.EmployeeService;
import com.springboot.model.Employee;

@RestController
@RequestMapping("/employee")
@CrossOrigin("http://localhost:3000/")
public class Controller {

	@Autowired
	private EmployeeService employeeService;
	
	
	@PostMapping
	public String add(@RequestBody Employee employee) {
		employeeService.saveEmploye(employee);
		return "New Employee is added";
	}
	
	
	
	@GetMapping
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployee(null);
	}
	
	
	
	@GetMapping("/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable int id){
		return employeeService.getEmployeeById(id);
		
	}
	
	@PutMapping("/{id}")
	public Employee updateEmployee(@PathVariable int id , @RequestBody Employee employee)
	{
		return employeeService.updateEmployee(id, employee);
	
}
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable int id ) {
		employeeService.deleteEmployee(id);
	}
	
}
