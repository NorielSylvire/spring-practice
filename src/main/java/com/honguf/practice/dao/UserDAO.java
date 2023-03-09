package com.honguf.practice.dao;

import com.honguf.practice.models.User;

import java.util.List;

public interface UserDAO {
	User getUser(long id);
	List<User> getUsers();
	void editUser(long id);
	void deleteUser(long id);
}