package com.jobportal.jobsphere.dto.user;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserUpdateRequest {

    @Size (
            min = 2,
            max = 255,
            message = "Full name must be between 2 and 255 characters"
    )
    private String fullName;

    @Pattern(
            regexp = "^[0-9]{10}$",
            message = "Phone number must contain exactly 10 digits"
    )
    private String phone;
}
