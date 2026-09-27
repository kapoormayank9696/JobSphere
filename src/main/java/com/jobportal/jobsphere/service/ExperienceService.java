package com.jobportal.jobsphere.service;

import com.jobportal.jobsphere.dto.experience.ExperienceCreateRequest;
import com.jobportal.jobsphere.entity.Experience;
import jakarta.validation.Valid;

import java.util.List;

public interface ExperienceService {

    Experience saveExperience(@Valid ExperienceCreateRequest experience);

    List<Experience> getAllExperiences();

    Experience getExperienceById(Long id);

    void deleteById(Long id);
}
