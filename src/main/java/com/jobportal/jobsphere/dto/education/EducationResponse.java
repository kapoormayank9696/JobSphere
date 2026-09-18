package com.jobportal.jobsphere.dto.education;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor

public class EducationResponse {

    private Long id;
    private Long userId;
    private String instituteName;
    private String degree;
    private String fieldOfStudy;
    private Integer startYear;
    private Integer endYear;
    private BigDecimal percentage;

}
