package com.hcmus.repository;

import java.util.List;

import com.hcmus.entity.Todo;

public interface TodoRepository {
	List<Todo> getTodosListByUser(int user);
	void createTodo(Todo todo);
}
