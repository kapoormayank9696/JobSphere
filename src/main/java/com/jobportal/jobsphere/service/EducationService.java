package com.jobportal.jobsphere.service;

import com.jobportal.jobsphere.entity.Education;
import java.util.List;

public interface EducationService {

    Education saveEducation(Education education);

    List<Education> getAllEducations();

    Education getEducationById(Long id);

    void deleteById(Long id);

}
