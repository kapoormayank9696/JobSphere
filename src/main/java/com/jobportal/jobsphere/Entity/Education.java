package com.jobportal.jobsphere.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Year;

@Entity
@Table(name = "Education")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private BigInteger id;

    @Column(name = "userId", nullable = false)
    private BigInteger userId;

    @Column(name = "institute_name", nullable = false)
    private String instituteName;

    @Column(name = "degree", nullable = false)
    private String degree;

    @Column(name = "field_of_study", nullable = false)
    private String fieldOfStudy;

    @Column(name = "start_year", nullable = false)
    private Year startYear;

    @Column(name = "end_year")
    private Year endYear;

    @Column(name = "percentage", precision = 5, scale = 2)
    private BigDecimal percentage;
}