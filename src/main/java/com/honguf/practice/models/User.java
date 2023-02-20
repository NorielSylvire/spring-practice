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
    private String phoneNumber;
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
     * @param phoneNumber
     * 		the telephone
     * @param dob
     * 		the date of birth
     */
    public User(long id, String username, String password, String fullName, String email, String phoneNumber, Date dob) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
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
     * Gets phone number.
     *
     * @return the phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Gets the date of birth.
     *
     * @return the date of birth
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
     * Sets phone number.
     *
     * @param phoneNumber
     * 		the phone number
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Sets the date of birth.
     *
     * @param dob
     * 		the date of birth
     */
    public void setDob(Date dob) {
        this.dob = dob;
    }
}