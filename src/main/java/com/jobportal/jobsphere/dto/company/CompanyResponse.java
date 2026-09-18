package com.jobportal.jobsphere.dto.company;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class CompanyResponse {

    private Long id;
    private String companyName;
    private String description;
    private String industry;
    private String website;
    private String email;
    private String phone;
    private String location;
    private String address;
    private String city;
    private String state;
    private String country;
    private String postalCode;
    private String companySize;
    private Integer foundedYear;

}
