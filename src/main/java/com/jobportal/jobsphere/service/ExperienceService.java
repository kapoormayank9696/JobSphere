package com.jobportal.jobsphere.service;

import com.jobportal.jobsphere.entity.Experience;

import java.util.List;

public interface ExperienceService {

    Experience saveExperience(Experience experience);

    List<Experience> getAllExperiences();

    Experience getExperienceById(Long id);

    void deleteById(Long id);
}
