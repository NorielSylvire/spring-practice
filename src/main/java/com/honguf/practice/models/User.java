package com.honguf.practice.models;

import java.util.Date;

/**
 * The type User.
 */
public class User {
    private long id;
    private String username;
    private String password;
    private String fullName;
    private String email;
    private String telephone;
    private Date dob;

    /**
     * Instantiates a new User.
     *
     * @param id
     * 		the id
     * @param username
     * 		the username
     * @param password
     * 		the password
     * @param fullName
     * 		the full name
     * @param email
     * 		the email
     * @param telephone
     * 		the telephone
     * @param dob
     * 		the date of birth
     */
    public User(long id, String username, String password, String fullName, String email, String telephone, Date dob) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.email = email;
        this.telephone = telephone;
        this.dob = dob;
    }

    /**
     * Instantiates a new User.
     *
     * @param id
     * 		the id
     */
    public User(long id) {
        this.id = id;
    }

    /**
     * Instantiates a new User.
     */
    public User() {
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * Gets username.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Gets full name.
     *
     * @return the full name
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Gets telephone.
     *
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Gets dob.
     *
     * @return the dob
     */
    public Date getDob() {
        return dob;
    }

    /**
     * Sets id.
     *
     * @param id
     * 		the id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Sets username.
     *
     * @param username
     * 		the username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Sets password.
     *
     * @param password
     * 		the password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Sets full name.
     *
     * @param fullName
     * 		the full name
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Sets email.
     *
     * @param email
     * 		the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Sets telephone.
     *
     * @param telephone
     * 		the telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * Sets dob.
     *
     * @param dob
     * 		the dob
     */
    public void setDob(Date dob) {
        this.dob = dob;
    }
}