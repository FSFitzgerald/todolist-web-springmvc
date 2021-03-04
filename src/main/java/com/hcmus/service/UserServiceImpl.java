package com.hcmus.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcmus.entity.User;
import com.hcmus.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	
	public int getIdByEmail(String email) {
		return userRepository.getIdByEmail(email);
	}
	
	public void create(User user) {
		userRepository.create(user);
		
	}
	
	public boolean login(String email, String password) {
		return userRepository.login(email, password);
	}
}
