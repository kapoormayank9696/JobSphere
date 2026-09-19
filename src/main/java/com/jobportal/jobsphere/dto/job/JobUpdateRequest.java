package com.jobportal.jobsphere.dto.job;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class JobUpdateRequest {

    @Size(
            max = 255,
            message = "Title cannot exceed 255 characters"
    )
    private String title;

    @Size (
            max = 5000,
            message = "Description cannot exceed 5000 characters"
    )
    private String description;

    @Size (
            max = 5000,
            message = "Requirement cannot exceed 5000 characters"
    )
    private String requirement;

    @Size (
            max = 50,
            message = "Employee type cannot exceed 50 characters"
    )
    private String employeeType;

    @Size (
            max = 50,
            message = "Experience level cannot exceed 50 characters"
    )
    private String experienceLevel;

    @DecimalMin(
            value = "0.00",
            message = "Minimum salary cannot be negative"
    )
    private BigDecimal salaryMin;

    @DecimalMin(
            value = "0.00",
            message = "Maximum salary cannot be negative"
    )
    private BigDecimal salaryMax;

    @Size(
            max = 255,
            message = "Location cannot exceed 255 characters"
    )
    private String location;

    @Size (
            max = 100,
            message = "City cannot exceed 100 characters"
    )
    private String city;

    @Size (
            max = 100,
            message = "State cannot exceed 100 characters"
    )
    private String state;

    @Size (
            max = 255,
            message = "Country cannot exceed 255 characters"
    )
    private String country;

    private Boolean remote;
    private String status;
    private Integer deadline;

}
