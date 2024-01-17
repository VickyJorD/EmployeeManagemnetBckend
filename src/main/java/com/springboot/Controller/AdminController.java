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

import com.springboot.Sevices.AdminService;
import com.springboot.model.Admin;
import com.springboot.model.Employee;

@RestController
@RequestMapping("/admin")
@CrossOrigin("http://localhost:3000/")
public class AdminController {
	
	
	@Autowired
	private AdminService adminService;
	
	
	@PostMapping
	public String add(@RequestBody Admin admin) {
		adminService.saveAdmin(admin);
		return "New admin is added";
	}
	
	@GetMapping
	public List<Admin> getAllAdmin(){
		return adminService.getAllAdmin(null);
	}
	
	
	
	@GetMapping("/{id}")
	public Optional<Admin> getAdminById(@PathVariable int id){
		return adminService.getAdminById(id);
		
	}
	
	@PutMapping("/{id}")
	public Admin updateAdmin(@PathVariable int id , @RequestBody Admin admin)
	{
		return adminService.updateAdmin(id, admin);
	
}
	

}
