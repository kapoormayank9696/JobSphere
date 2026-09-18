package com.jobportal.jobsphere.dto.experience;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class ExperienceUpdateRequest {

    @Size(
            max = 255,
            message = "Company name cannot exceed 255 characters"
    )
    private String companyName;

    @Size (
            max = 255,
            message = "Job title cannot exceed 255 characters"
    )
    private String jobTitle;

    @Size (
            max = 50,
            message = "Employee type cannot exceed 50 characters"
    )
    private String employeeId;

    @Size(
            max = 255,
            message = "Location cannot exceed 255 characters"
    )
    private String location;

    private Integer startDate;
    private Integer endDate;
    private Boolean currentlyWorking;

    @Size(
            max = 5000,
            message = "Description cannot exceed 5000 characters"
    )
    private String description;

}
