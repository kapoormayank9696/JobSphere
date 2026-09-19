package com.jobportal.jobsphere.dto.role;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class RoleCreateRequest {

    @NotBlank(message = "Role name is required")
    @Size (
            max = 255,
            message = "Role name cannot exceed 255 characters"
    )
    private String roleName;

    @NotBlank(message = "Description is required")
    @Size (
            max = 5000,
            message = "Description cannot exceed 5000 characters"
    )
    private String description;

}
