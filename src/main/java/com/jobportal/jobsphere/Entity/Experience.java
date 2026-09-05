package com.jobportal.jobsphere.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "experience")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "company_name",nullable = false,length = 255)
    private String companyName;

    @Column(name = "job_title",nullable = false,length = 255)
    private String jobTitle;

    @Column(name = "employee_type",length = 50)
    private String employeeType;

    @Column(name = "location",length = 255)
    private String location;

    @Column(name = "start_date",nullable = false)
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "currently_working",nullable = false)
    private Boolean currentlyWorking = false;

    @Column(name = "description",columnDefinition = "TEXT")
    private String description;
}
