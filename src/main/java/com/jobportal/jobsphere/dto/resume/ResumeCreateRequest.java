package com.jobportal.jobsphere.dto.resume;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ResumeCreateRequest {

    @NotNull(message = "User id is required")
    private Long userId;

    @NotBlank(message = "Resume name is required")
    @Size (
            max = 100,
            message = "Resume name cannot exceed 100 characters"
    )
    private String resumeName;

    @NotBlank(message = "File name is required")
    @Size (
            max = 255,
            message = "File name cannot exceed 255 characters"
    )
    private String fileName;

    @NotBlank(message = "File url is required")
    @Size (
            max = 500,
            message = "File url cannot exceed 500 characters"
    )
    private String fileUrl;

    @NotNull(message = "Default status is required")
    @Min(value = 0,message = "Default status must be 0 or 1")
    @Max(value = 1,message = "Default status must be 0 or 1")
    private Integer isDefault;
}
