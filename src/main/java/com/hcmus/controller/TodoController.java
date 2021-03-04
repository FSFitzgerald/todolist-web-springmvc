package com.hcmus.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hcmus.entity.Todo;
import com.hcmus.entity.TodoForm;
import com.hcmus.service.TodoService;
import com.hcmus.service.UserService;

@Controller
public class TodoController {
	@Autowired
	private UserService userService;
	@Autowired
	private TodoService todoService;
	
	@RequestMapping(value="/user/todos/new")
	public String showCreateTodoPage(@ModelAttribute("todo") TodoForm todoform) {
		return "todo/create";
	}
	
	@RequestMapping(value="/user/todos/new.do", method = RequestMethod.POST)
	public String doCreateTodo(@Valid @ModelAttribute("todo") TodoForm todoForm, BindingResult bindingResult, HttpSession session) {
		
		if(bindingResult.hasErrors()) {
			return "todo/create";
		}
		
		Todo todo = new Todo();
		todo.setTitle(todoForm.getTitle());
		todo.setDueDate(todoForm.getDueDate());
		todo.setDone(false);
		todo.setUser((int)session.getAttribute("id"));
		System.out.println(todo.getDueDate());
		todoService.createTodo(todo);
		return "redirect:/user/todos";
	}
}
