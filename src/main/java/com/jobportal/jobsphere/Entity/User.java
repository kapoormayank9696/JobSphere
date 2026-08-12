package com.jobportal.jobsphere.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Entity
@Table(name="user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="userId")
    private BigInteger id;

    @Column(name="full_name",nullable = false)
    private String username;

    @Column(name="email",nullable = false,unique = true)
    private String email;

    @Column(name="password",nullable = false)
    private String password;

    @Column(name="phone",nullable = false)
    private String phone;
}

