package com.jobportal.jobsphere.Services;

import com.jobportal.jobsphere.Entity.Education;

import java.util.List;

public interface EducationServices {
    Education educationSaver(Education education);
    List<Education> getAllEducation();
    Education getById(int id);
    void deleteById(int id);
}
