package com.jobportal.jobsphere.dto.job;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor

public class JobResponse {

    private Integer id;
    private Integer userId;
    private String title;
    private String description;
    private String requirement;
    private String employeeType;
    private String experienceLevel;
    private BigDecimal salaryMin;
    private BigDecimal salaryMax;
    private String location;
    private String city;

}
