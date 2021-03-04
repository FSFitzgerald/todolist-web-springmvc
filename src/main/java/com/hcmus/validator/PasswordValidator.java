package com.hcmus.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<Password, String> {

	@Override
	public boolean isValid(String password, ConstraintValidatorContext context) {
		boolean hasUppercase = false, hasLowercase = false, hasNumber = false;
		for(int i = 0; i < password.length(); i++) {
			char ch = password.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				hasLowercase = true;
			}else if(ch >= 'A' && ch <= 'Z') {
				hasUppercase = true;
			}else if(ch >= '0' && ch <= '9') {
				hasNumber = true;
			}
		}
		return hasLowercase && hasUppercase && hasNumber;
	}
}
