package com.springboot.Sevices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.Repository.AdminRepo;
import com.springboot.model.Admin;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminRepo adminRepo;

	@Override
	public Admin saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepo.save(admin);
	}

	@Override
	public List<Admin> getAllAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepo.findAll();
	}

	@Override
	public Optional<Admin> getAdminById(int id) {
		// TODO Auto-generated method stub
		return adminRepo.findById(id);
	}

	@Override
	public Admin updateAdmin(int id, Admin admin) {
		Admin update = adminRepo.findById(id).orElseThrow();
		update.setId(admin.getId());
		update.setUsername(admin.getUsername());
		update.setUsername(admin.getUsername());
		return adminRepo.save(update);
	}

}
