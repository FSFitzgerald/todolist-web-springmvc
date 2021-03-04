package com.hcmus.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hcmus.entity.RegistrationForm;
import com.hcmus.entity.Todo;
import com.hcmus.entity.User;
import com.hcmus.service.TodoService;
import com.hcmus.service.UserService;

@Controller
public class UserController {
	@Autowired
	TodoService todoService;
	@Autowired
	UserService userService;
	
	@RequestMapping("/register")
	public String loadRegisterPage(@ModelAttribute("registrationForm") RegistrationForm registrationForm) {
		return "user/register";
	}
	
	@RequestMapping(value = "/register.do", method=RequestMethod.POST)
	public String doRegister(@Valid @ModelAttribute("registrationForm") RegistrationForm registrationForm, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "user/register";
		}
		User user = new User();
		user.setEmail(registrationForm.getEmail());
		user.setPassword(registrationForm.getPassword());
		userService.create(user);
		return "redirect:/login";
	}
	
	@RequestMapping(value = "/user/todos")
	public String loadToDoList(Model model, HttpSession session) {
		//get todolist from by email from session
		int id = (int)session.getAttribute("id");
		List<Todo> todoList = todoService.getTodoListByUser(id);
		model.addAttribute("todolist", todoList);
		return "user/home";
	}
}
