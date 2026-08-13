package com.jobportal.jobsphere.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "skills")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;

    @Column(name = "skill_name",nullable = false,unique = true)
    private String skillName;

    @Column(name = "description")
    private String description;

    @Column(name = "created_at",nullable = false,updatable = false)
    private LocalDateTime createdAt;
}
