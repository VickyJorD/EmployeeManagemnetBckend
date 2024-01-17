package com.springboot.Sevices;

import java.util.List;
import java.util.Optional;

import com.springboot.model.Admin;
import com.springboot.model.Employee;

public interface AdminService {
public Admin saveAdmin(Admin admin);
	
	public List<Admin> getAllAdmin(Admin admin);
	public Optional<Admin> getAdminById(int id);
	public Admin updateAdmin(int id,Admin admin);
	

}
