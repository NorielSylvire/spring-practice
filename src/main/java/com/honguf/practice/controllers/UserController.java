package com.honguf.practice.controllers;

import com.honguf.practice.models.User;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.time.LocalDate;

/**
 * The type User controller.
 */
@RestController
public class UserController {

    /**
     * Gets user.
     *
     * @param id
     * 		the id
     * @return the user
     */
    @RequestMapping(value = "user/{id}")
    public User getUser(@PathVariable long id)
    {
        User user = new User();
        user.setId(id);
        user.setUsername("blackdragon" + id);
        user.setEmail("smith.john@company.com");
        user.setFullName("John Smith");
        user.setPassword("dragon1234");
        user.setDob(Date.valueOf(LocalDate.of(1986, 9, 13)));
        return user;
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