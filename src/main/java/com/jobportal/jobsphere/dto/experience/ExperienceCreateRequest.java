package com.jobportal.jobsphere.dto.experience;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ExperienceCreateRequest {

    @NotNull(message = "User Id is required")
    private Long userId;

    @NotBlank(message = "Company name is required")
    @Size(
            max = 255,
            message = "Company name cannot exceed 255 characters"
    )
    private String companyName;

    @NotBlank(message = "Job title is required")
    @Size(
            max = 255,
            message = "Job title cannot exceed 255 characters"
    )
    private String jobTitle;

    @NotBlank(message = "Employee type is required")
    @Size(
            max = 50,
            message = "Employee type cannot exceed 50 characters"
    )
    private String employeeType;

    @NotBlank(message = "Location is required")
    @Size(
            max = 255,
            message = "Location cannot exceed 255 characters"
    )
    private String location;

    @NotNull(message = "Start year is required")
    private LocalDate startDate;

    private LocalDate endDate;

    @NotNull(message = "Currently Working status is required")
    private Boolean currentlyWorking;

    @NotBlank(message = "Description is required")
    @Size(
            max = 5000,
            message = "Description cannot exceed 5000 characters"
    )
    private String description;
}