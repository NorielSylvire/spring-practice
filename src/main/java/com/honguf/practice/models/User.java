package com.honguf.practice.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * The type User.
 */
public class User {
    @Getter
    @Setter
    private long id;
    @Getter
    @Setter
    private String username;
    @Getter
    @Setter
    private String password;
    @Getter
    @Setter
    private String fullName;
    @Getter
    @Setter
    private String email;
    @Getter
    @Setter
    private String phoneNumber;
    @Getter
    @Setter
    private Date dob;

    /*CREATE TABLE users (
            UserID int,
            Username varchar(255),
    Passwrd varchar(255),
    FullName varchar(255),
    Email varchar(255),
    PhoneNumber varchar(255),
    DOB Date
  );*/

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
}