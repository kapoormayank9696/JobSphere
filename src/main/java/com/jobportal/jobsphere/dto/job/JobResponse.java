package com.jobportal.jobsphere.dto.job;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class JobResponse {

    private Long id;
    private Long companyId;
    private String title;
    private String description;
    private String requirement;
    private String employeeType;
    private String experienceLevel;
    private BigDecimal salaryMin;
    private BigDecimal salaryMax;
    private String location;
    private String city;
    private String state;
    private String country;
    private Boolean remote;
    private String status;
    private Integer deadline;

}
