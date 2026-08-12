package com.jobportal.jobsphere.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "company")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "company_name",nullable = false)
    private String companyName;

    @Column(name = "description",nullable = false)
    private String description;

    @Column(name = "industry",nullable = false)
    private String industry;

    @Column(name = "website",nullable = false)
    private String websites;

    @Column(name = "email",nullable = false,unique = true)
    private String email;

    @Column(name = "phone",nullable = false)
    private String phone;

    @Column(name = "location",nullable = false)
    private String location;

    @Column(name = "address",nullable = false)
    private String address;

    @Column(name = "city",nullable = false)
    private String city;

    @Column(name = "state",nullable = false)
    private String state;

    @Column(name = "country",nullable = false)
    private String country;

    @Column(name = "postalCode",nullable = false)
    private String postalCode;

    @Column(name = "logoUrl",nullable = false)
    private String logoUrl;

    @Column(name = "companySize",nullable = false)
    private String companySize;

    @Column(name = "foundedYear",nullable = false)
    private Integer foundedYear;

    @Column(name = "verified",nullable = false)
    private Boolean verified;

    @Column(name = "status",nullable = false)
    private String status;

    @Column(name = "created_at",nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "update_at",nullable = false)
    private LocalDateTime updatedAt;
}
