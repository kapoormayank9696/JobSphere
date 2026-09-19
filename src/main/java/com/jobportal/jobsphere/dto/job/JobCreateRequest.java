package com.jobportal.jobsphere.dto.job;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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

    @NotNull(message = "Company Id is required")
    private Long companyId;

    @NotBlank(message = "Title is required")
    @Size(
            max = 255,
            message = "Title cannot exceed 255 characters"
    )
    private String title;

    @NotBlank(message = "Description is required")
    @Size(
            max = 5000,
            message = "Description cannot exceed 5000 characters"
    )
    private String description;

    @NotBlank(message = "Requirement is required")
    @Size(
            max = 5000,
            message = "Requirement cannot exceed 5000 characters"
    )
    private String requirement;

    @NotBlank(message = "Employee type is required")
    @Size(
            max = 50,
            message = "Employee type cannot exceed 50 characters"
    )
    private String employeeType;

    @NotBlank(message = "Experience level is required")
    @Size(
            max = 50,
            message = "Experience level cannot exceed 50 characters"
    )
    private String experienceLevel;

    @NotNull(message = "Minimum salary is required")
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

    @NotBlank(message = "Location is required")
    @Size(
            max = 255,
            message = "Location cannot exceed 255 characters"
    )
    private String location;

    @NotBlank(message = "City is required")
    @Size(
            max = 100,
            message = "City cannot exceed 100 characters"
    )
    private String city;

    @NotBlank(message = "State is required")
    @Size(
            max = 100,
            message = "State cannot exceed 100 characters"
    )
    private String state;

    @NotBlank(message = "Country is required")
    @Size(
            max = 255,
            message = "Country cannot exceed 255 characters"
    )
    private String country;

    @NotNull(message = "Remote status is required")
    private Boolean remote;

    @NotBlank(message = "Status is required")
    private String status;

    @NotNull(message = "Deadline is required")
    private Integer deadline;

}