package com.jobportal.jobsphere.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "skills")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private BigInteger id;

    @Column(name = "skill_name",nullable = false)
    private String skillName;

    @Column(name = "description",nullable = false)
    private String description;

    @Column(name = "created_at",nullable = false,updatable = false)
    private LocalDateTime createdAt;
}
