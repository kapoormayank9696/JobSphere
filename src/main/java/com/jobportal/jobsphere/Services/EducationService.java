package com.jobportal.jobsphere.Services;

import com.jobportal.jobsphere.Entity.Education;

import java.util.List;

public interface EducationServices {

    Education saveEducation(Education education);

    List<Education> getAllEducations();

    Education getEducationById(Long id);

    void deleteById(Long id);

}
