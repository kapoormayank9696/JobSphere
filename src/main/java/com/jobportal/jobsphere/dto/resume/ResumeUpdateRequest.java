package com.jobportal.jobsphere.dto.resume;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class ResumeUpdateRequest {

    private Integer userId;

    @Size(
            max = 100,
            message = "Resume name cannot exceed 100 characters"
    )
    private String resumeName;

    @Size (
            max = 255,
            message = "File name cannot exceed 255 characters"
    )
    private String fileName;

    @Size (
            max = 500,
            message = "File url cannot exceed 500 characters"
    )
    private String fileUrl;

    @Min(value = 0,message = "Default status must be 0 or 1")
    @Max(value = 1,message = "Default status must be 0 or 1")
    private Integer isDefault;
}
