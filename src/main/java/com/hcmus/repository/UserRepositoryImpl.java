package com.hcmus.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.hcmus.entity.User;

@Repository()
public class UserRepositoryImpl implements UserRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public boolean login(String email, String password) {
		TypedQuery<User> query = entityManager.createNamedQuery("findUserByEmailAndPassword", User.class);
		query.setParameter("p_email", email);
		query.setParameter("p_password", password);
		User user = query.getSingleResult();
		return user != null;
	}

	@Override
	public void create(User user) {
		entityManager.persist(user);
	}

	@Override
	public int getIdByEmail(String email) {
		TypedQuery<User> query = entityManager.createNamedQuery("getUserByEmail", User.class);
		query.setParameter("p_email", email);
		User user = query.getSingleResult();
		return user.getId();
	}

}
