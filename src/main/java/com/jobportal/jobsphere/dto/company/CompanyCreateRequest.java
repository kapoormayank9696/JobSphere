package com.jobportal.jobsphere.dto.company;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

public class CompanyCreateRequest {
    @NotBlank(message = "Company name is required")
    @Size(
            min = 5,
            max = 255,
            message = "Company name must be between 5 and 255 characters"
    )
    private String companyName;

    @NotBlank(message = "Company description is required")
    private String description;

    @NotBlank(message = "Industry is required")
    @Size (
            max = 255,
            message = "Industry cannot exceed 255 characters"
    )
    private String industry;

    @NotBlank(message = "Website is required")
    @Size (
            max = 255,
            message = "Website cannot exceed 255 characters"
    )
    private String website;
}
