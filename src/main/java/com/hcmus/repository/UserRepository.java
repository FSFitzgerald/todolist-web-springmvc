package com.hcmus.repository;

import com.hcmus.entity.User;


public interface UserRepository{
	int getIdByEmail(String email);
	boolean login(String email, String password);
	void create(User user);
}
