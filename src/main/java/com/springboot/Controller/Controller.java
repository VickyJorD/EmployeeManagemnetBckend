package com.springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Sevices.EmployeeService;
import com.springboot.model.Employee;

@RestController
@RequestMapping("/employee")
@CrossOrigin
public class Controller {

	@Autowired
	private EmployeeService employeeService;
	
	
	@PostMapping("/add")
	public String add(@RequestBody Employee employee) {
		employeeService.saveEmploye(employee);
		return "New EMployee is added";
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
	}
}
