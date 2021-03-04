package com.hcmus.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.hcmus.entity.Todo;

@Repository
public class TodoRepositoryImpl implements TodoRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Todo> getTodosListByUser(int user) {
		TypedQuery<Todo> query = entityManager.createNamedQuery("findTodosByUser", Todo.class);
		query.setParameter("p_user", user);
		return query.getResultList();
	}

	@Override
	public void createTodo(Todo todo) {
		entityManager.persist(todo);
	}

}
