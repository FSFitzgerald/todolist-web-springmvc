package com.hcmus.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.hcmus.validator.Password;

public class RegistrationForm {
	@NotBlank
	@Email
	private String email;
	@NotBlank
	@Size(min = 6, max = 20)
	@Password
	private String password;
	@NotBlank
	@Size(min = 6, max = 20)
	private String confirmationPassword;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmationPassword() {
		return confirmationPassword;
	}
	public void setConfirmationPassword(String confirmationPassword) {
		this.confirmationPassword = confirmationPassword;
	}
	
	
}
