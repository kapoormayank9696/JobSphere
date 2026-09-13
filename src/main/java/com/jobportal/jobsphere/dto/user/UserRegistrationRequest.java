package com.jobportal.jobsphere.dto.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class UserRegistrationRequest {
    @NotBlank(message = "Full name is required")
    @Size (
            min = 2,
            max = 255,
            message = "Full name must be between 2 and 255 characters"
    )
    private String fullName;

    @NotBlank (message = "Email is required")
    @Email (message = "Please provide a valid email address")
    @Size (
            max = 255,
            message = "Email cannot exceed 255 characters"
    )
    private String email;

    @NotBlank (message = "Password is required")
    @Size (
            min = 8,
            max = 100,
            message = "Password must be between 8 and 100 characters"
    )
    private String password;

    @NotBlank (message = "Phone number is required")
    @Pattern (
            regexp = "^[0-9]{10}$",
            message = "Phone number must contain exactly 10 digits"
    )
    private String phone;
}
