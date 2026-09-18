package com.jobportal.jobsphere.dto.experience;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class ExperienceResponse {

    private long id;
    private long userId;
    private String companyName;
    private String jobTitle;
    private String employeeType;
    private String location;
    private Integer startDate;
    private Integer endDate;
    private Boolean currentlyWorking;
    private String description;

}
