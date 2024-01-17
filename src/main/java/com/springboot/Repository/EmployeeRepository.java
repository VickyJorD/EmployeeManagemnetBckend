package com.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.springboot.model.Employee;

@Repository

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	
	
}
