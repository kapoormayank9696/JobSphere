package com.jobportal.jobsphere.dto.company;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
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

    @NotBlank (message = "Email is required")
    @Email(message = "Please provide a valid email address")
    @Size (
            max = 255,
            message = "Company email cannot exceed 255 characters"
    )
    private String email;

    @NotBlank (message = "Company phone number is required")
    @Pattern(
            regexp = "^[0-9]{10}$",
            message = "Phone number must contain exactly 10 digits"
    )
    private String phone;

    @NotBlank(message = "Location is required")
    @Size (
            max = 255,
            message = "Location cannot exceed 255 characters"
    )
    private String location;

    @NotBlank(message = "Company address is required")
    @Size (
            max = 255,
            message = "Address cannot exceed 255 characters"
    )
    private String address;

    @NotBlank(message = "Company city is required")
    @Size (
            max = 100,
            message = "City cannot exceed 100 characters"
    )
    private String city;

    @NotBlank(message = "State is required")
    @Size(
            max = 100,
            message = "State cannot exceed 100 characters"
    )
    private String state;

    @NotBlank(message = "Country is required")
    @Size(
            max = 100,
            message = "Country cannot exceed 100 characters"
    )
    private String country;

    @NotBlank(message = "Postal code is required")
    @Size(
            max = 20,
            message = "Postal code cannot exceed 20 characters"
    )
    private String postalCode;

    @NotBlank(message = "Company size is required")
    @Size(
            max = 100,
            message = "Company size cannot exceed 100 characters"
    )
    private String companySize;

    private Integer foundedYear;
}
