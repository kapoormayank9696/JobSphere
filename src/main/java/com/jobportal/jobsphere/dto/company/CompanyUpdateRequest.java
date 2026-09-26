package com.jobportal.jobsphere.dto.company;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class CompanyUpdateRequest {

    @Size (
            min = 2,
            max = 255,
            message = "Company name must be between 2 and 255 characters"
    )
    private String companyName;

    @Size (
            max = 5000,
            message = "Description cannot exceed 5000 characters"
    )
    private String description;

    @Size (
            max = 255,
            message = "Website cannot exceed 255 characters"
    )
    private String website;

    @Email(message = "Please provide a valid email address")
    @Size(
            max = 255,
            message = "Email cannot exceed 255 characters"
    )
    private String email;

    @Pattern(
            regexp = "^[0-9]{10}$" ,
            message = "Phone number must contain 10 digits"
    )
    private String phone;

    @Size (
            max = 255,
            message = "Location cannot exceed 255 characters"
    )
    private String location;

    @Size (
            max = 255,
            message = "Address is must contain in 255 characters"
    )
    private String address;

    @Size (
            max = 100,
            message = "City is must contain in 100 characters"
    )
    private String city;

    @Size (
            max = 100,
            message = "State is must contain in 100 characters"
    )
    private String state;

    @Size (
            max = 100,
            message = "Country is must contain in 100 characters"
    )
    private String country;

    @Size(
            max = 20,
            message = "Postal Code cannot exceed 20 characters"
    )
    private String postalCode;

    @Size(
            max = 100,
            message = "Company size cannot exceed 100 characters"
    )
    private String companySize;

    private Integer foundedYear;
}
