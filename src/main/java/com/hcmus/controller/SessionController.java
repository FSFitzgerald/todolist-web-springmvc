package com.hcmus.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hcmus.entity.LoginForm;
import com.hcmus.service.UserService;

@Controller
public class SessionController {
	@Autowired
	private UserService userService;

	@RequestMapping("/login")
	public String getLoginPage(@ModelAttribute("loginForm") LoginForm loginForm) {
		return "user/login";
	}

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String doLogin(@Valid @ModelAttribute("loginForm") LoginForm loginForm, BindingResult binderResult, HttpSession session) {

		if(binderResult.hasErrors()) {
			return "user/login";
		}
		
		if (userService.login(loginForm.getEmail(), loginForm.getPassword())) {
			// set session
			session.setAttribute("id", userService.getIdByEmail(loginForm.getEmail()));
			return "redirect:user/todos";
		} else {
			return "index";
		}
	}
	
	@RequestMapping("/user/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}
