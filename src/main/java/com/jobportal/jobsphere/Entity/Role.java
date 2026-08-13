package com.jobportal.jobsphere.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name="roles")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "role_name", nullable = false,unique = true)
    private String roleName;

    @Column(name = "description",nullable = false)
    private String description;

    @Column(name = "created_at",nullable = false,updatable = false)
    private LocalDateTime createdAt;
}
