package com.hcmus.service;

import java.util.List;

import com.hcmus.entity.Todo;

public interface TodoService {
	List<Todo> getTodoListByUser(int id);
	void createTodo(Todo todo);
}
