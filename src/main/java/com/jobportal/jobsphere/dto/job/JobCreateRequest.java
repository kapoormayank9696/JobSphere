package com.jobportal.jobsphere.dto.job;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
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

public class JobCreateRequest {

    @NotBlank(message = "Company Id is required")
    private Integer userId;

    @NotBlank(message = "Tile is must be required")
    @Size (
            max = 255,
            message = "Tile cannot exceed from 255 characters"
    )
    private String title;

    @NotBlank(message = "Description")
    @Size (
            max = 5000,
            message = "Description cannot be exceed from 5000 characters"
    )
    private String description;

    @NotBlank(message = "Requirement")
    @Size (
            max = 5000,
            message = "Requirement cannot be exceed from 5000 characters"
    )
    private String requirement;

    @NotBlank(message = "Employee Type is required")
    @Size (
            max = 50,
            message = "Employee type is cannot exceed to 50 characters"
    )
    private String employeeType;

    @NotBlank(message = "Experience Level is required")
    @Size (
            max = 50,
            message = "Experience level is cannot exceed to 50 characters"
    )
    private String experienceLevel;

    @NotBlank(message = "Minimum Salary is required")
    private BigDecimal salaryMin;
}
