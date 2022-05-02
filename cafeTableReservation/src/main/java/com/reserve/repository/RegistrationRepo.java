package com.reserve.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.reserve.entity.User;

public interface RegistrationRepo extends JpaRepository<User, Integer>{

//	public User findByEmail(String emailId);
	
	public User findByEmailIdAndPassword(String email, String password);
	//public User findByEmailIdAndPass(String email, String password);

	public User findByEmailId(String emailId);
}
