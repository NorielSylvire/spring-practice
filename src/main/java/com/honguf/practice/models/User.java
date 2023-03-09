package com.honguf.practice.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

/**
 * The type User.
 */
@Entity
@Table(name = "users")
public class User {
    @Id
    @Getter @Setter @Column(name = "id")
    private long id;
    @Getter @Setter @Column(name = "username")
    private String username;
    @Getter @Setter @Column(name = "password")
    private String password;
    @Getter @Setter @Column(name = "full_name")
    private String fullName;
    @Getter @Setter @Column(name = "email")
    private String email;
    @Getter @Setter @Column(name = "phone_number")
    private String phoneNumber;
    @Getter @Setter @Column(name = "dob")
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
}