package com.jobportal.jobsphere.service.impl;

import com.jobportal.jobsphere.entity.Experience;
import com.jobportal.jobsphere.repository.ExperienceRepository;
import com.jobportal.jobsphere.service.ExperienceService;

import java.util.List;

public class ExperienceServiceImpl implements ExperienceService {

    // Data Members with final Keyword
    private final ExperienceRepository experienceRepository;

    // Parameterized Constructor
    public ExperienceServiceImpl(ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }

    @Override
    public Experience saveExperience(Experience experience) {
        return experienceRepository.save(experience);
    }

    @Override
    public List<Experience> getAllExperiences() {
        return experienceRepository.findAll();
    }

    @Override
    public Experience getExperienceById(Long id) {
        return experienceRepository.getReferenceById(id);
    }

    @Override
    public void deleteById(Long id) {
        experienceRepository.deleteById(id);
    }
}
