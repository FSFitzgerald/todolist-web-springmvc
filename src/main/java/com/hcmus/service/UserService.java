package com.hcmus.service;

import com.hcmus.entity.User;

public interface UserService {
	void create(User user);
	boolean login(String email, String password);
	int getIdByEmail(String email);
}
