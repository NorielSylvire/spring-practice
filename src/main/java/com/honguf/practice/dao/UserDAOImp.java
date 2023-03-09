package com.honguf.practice.dao;

import com.honguf.practice.models.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class UserDAOImp implements UserDAO{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public User getUser(long id) {
		return null;
	}

	@Override
	@Transactional
	public List<User> getUsers() {
		String query = "FROM User";
		return entityManager.createQuery(query).getResultList();
	}

	@Override
	public void editUser(long id) {

	}

	@Override
	public void deleteUser(long id) {

	}
}