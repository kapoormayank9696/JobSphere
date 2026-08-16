package com.jobportal.jobsphere.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Experience")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "company_name",nullable = false)
    private String companyName;

    @Column(name = "job_title",nullable = false)
    private String jobTitle;

    @Column(name = "employee_type",nullable = false)
    private String employeeType;

    @Column(name = "location",nullable = false)
    private String location;

    @Column(name = "start_date",nullable = false)
    private Integer startDate;

    @Column(name = "end_date",nullable = false)
    private Integer endDate;

    @Column(name = "current_working",nullable = false)
    private Boolean currentWoking;

    @Column(name = "description")
    private String description;
}
