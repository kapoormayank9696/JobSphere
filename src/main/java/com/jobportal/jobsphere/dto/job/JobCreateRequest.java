package com.jobportal.jobsphere.dto.job;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class JobCreateRequest {

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
}
