package com.hcmus.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcmus.entity.Todo;
import com.hcmus.repository.TodoRepository;

@Service
@Transactional
public class TodoServiceImpl implements TodoService{
	@Autowired
	TodoRepository todoRepository;

	@Override
	public List<Todo> getTodoListByUser(int id) {
		return todoRepository.getTodosListByUser(id);
	}

	@Override
	public void createTodo(Todo todo) {
		todoRepository.createTodo(todo);
	}
}
