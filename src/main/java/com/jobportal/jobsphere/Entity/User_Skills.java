package com.jobportal.jobsphere.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.time.Year;

@Entity
@Table(name = "skills")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class User_Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id",nullable = false)
    private BigInteger userId;

    @Column(name = "skill_id",nullable = false)
    private BigInteger skillId;

    @Column(name = "proficiency_level",nullable = false)
    private String proficiencyLevel;

    @Column(name = "years_of_experience",nullable = false)
    private Year yearOfExperience;
}
