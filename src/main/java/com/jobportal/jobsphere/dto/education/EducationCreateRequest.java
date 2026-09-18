package com.jobportal.jobsphere.dto.education;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor

public class EducationCreateRequest {

    @NotBlank(message = "User Id is required")
    private int userId;

    @NotBlank(message = "Institute name is required")
    @Size (
            max = 255 ,
            message = "Institute name cannot exceed 255 characters"
    )
    private String instituteName;

    @NotBlank(message = "Degree is required")
    @Size (
            min = 2,
            max = 255,
            message = "Degree must be between 2 and 255 characters"
    )
    private String degree;

    @NotBlank(message = "Field of study is required")
    @Size(
            max = 255,
            message = "Field of study cannot exceed 255 characters"
    )
    private String fieldOfStudy;

    @NotBlank(message = "Start year is required")
    @Min(
            value = 1900,
            message = "Start year must be valid"
    )
    private Integer startYear;

    @Min(value = 1900, message = "End year must be valid")
    private Integer endYear;
}
