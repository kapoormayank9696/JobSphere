package com.jobportal.jobsphere.service;

import com.jobportal.jobsphere.dto.education.EducationCreateRequest;
import com.jobportal.jobsphere.entity.Education;
import jakarta.validation.Valid;

import java.util.List;

public interface EducationService {

    Education saveEducation(@Valid EducationCreateRequest education);

    List<Education> getAllEducations();

    Education getEducationById(Long id);

    void deleteById(Long id);

}
