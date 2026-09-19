package com.jobportal.jobsphere.dto.role;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class RoleUpdateRequest {

    @Size(
            max = 255,
            message = "Role name cannot exceed 255 characters"
    )
    private String roleName;

    @Size (
            max = 5000,
            message = "Description cannot exceed 5000 characters"
    )
    private String description;

}
