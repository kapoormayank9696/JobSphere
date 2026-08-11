package com.jobportal.jobsphere.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "resumes")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Resume {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private BigInteger id;

    @Column(name = "user_id",nullable = false)
    private BigInteger userId;

    @Column(name = "resume_name",nullable = false)
    private String resumeName;

    @Column(name = "file_name",nullable = false)
    private String fileName;

    @Column(name = "file_url",nullable = false)
    private String fileUrl;

    @Column(name = "is_default",nullable = false)
    private String isDefault;

    @Column(name = "created_at",nullable = false,updatable = false)
    private LocalDateTime createdAt;
}
