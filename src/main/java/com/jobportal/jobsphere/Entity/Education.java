package com.jobportal.jobsphere.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "education")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "institute_name", nullable = false,length = 255)
    private String instituteName;

    @Column(name = "degree", nullable = false,length = 100)
    private String degree;

    @Column(name = "field_of_study", nullable = false,length = 150)
    private String fieldOfStudy;

    @Column(name = "start_year", nullable = false)
    private Integer startYear;

    @Column(name = "end_year")
    private Integer endYear;

    @Column(name = "percentage", precision = 5, scale = 2)
    @DecimalMin(value = "0.0", message = "Percentage cannot be less than 0")
    @DecimalMax(value = "100.0", message = "Percentage cannot be greater than 100")
    private BigDecimal percentage;
}