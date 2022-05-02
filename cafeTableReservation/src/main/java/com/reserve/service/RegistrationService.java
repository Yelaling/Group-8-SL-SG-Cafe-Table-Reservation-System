package com.reserve.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reserve.entity.User;
import com.reserve.repository.RegistrationRepo;

@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationRepo repo;
	
	public User saveUser(User user) {
		return repo.save(user);
		
	}
	
	public User fetchUserByEmailId(String email) {
	return 	repo.findByEmailId(email);

	}//select * from user where emailid=?;
	
	public User fetchUserByEmailIdAndPass(String email, String password) {
		
		return repo.findByEmailIdAndPassword(email, password);
		}
	
	public List<User> getAllUser() {
		return repo.findAll();
	}
}
