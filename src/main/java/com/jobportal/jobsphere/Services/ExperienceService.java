package com.jobportal.jobsphere.Services;

import com.jobportal.jobsphere.Entity.Experience;

import java.util.List;

public interface ExperienceService {

    Experience saveExperience(Experience experience);

    List<Experience> getAllExperiences();

    Experience getById(Long id);

    void deleteById(Long id);
}
