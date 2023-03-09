package com.honguf.practice.controllers;

import com.honguf.practice.dao.UserDAO;
import com.honguf.practice.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

/**
 * The type User controller.
 */
@RestController
public class UserController {

    @Autowired
    private UserDAO UserDao;

    /**
     * Gets user.
     *
     * @param id
     * 		the id
     * @return the user
     */
    @RequestMapping(value = "api/user/{id}")
    public User getUser(@PathVariable long id)
    {
        return UserDao.getUser(id);
    }

	@RequestMapping(value = "api/users")
	public List<User> getUsers()
	{
		return UserDao.getUsers();
	}

    /**
     * Edit user.
     *
     * @param id
     * 		the id
     */
    public void editUser(long id)
    {

    }

    /**
     * Delete user.
     *
     * @param id
     * 		the id
     */
    public void deleteUser(long id)
    {

    }
}