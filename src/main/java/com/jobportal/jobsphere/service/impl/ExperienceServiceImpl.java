package com.jobportal.jobsphere.service.impl;

import com.jobportal.jobsphere.dto.experience.ExperienceCreateRequest;
import com.jobportal.jobsphere.entity.Experience;
import com.jobportal.jobsphere.exception.ResourceNotFoundException;
import com.jobportal.jobsphere.repository.ExperienceRepository;
import com.jobportal.jobsphere.service.ExperienceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceServiceImpl implements ExperienceService {

    // Data Member
    private final ExperienceRepository experienceRepository;

    // Parameterized Constructor
    public ExperienceServiceImpl(ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }

    // Save Experience
    @Override
    public Experience saveExperience(ExperienceCreateRequest request) {

        // Convert DTO -> Entity
        Experience experience = new Experience();

        experience.setCompanyName(request.getCompanyName());
        experience.setJobTitle(request.getJobTitle());
        experience.setEmployeeType(request.getEmployeeType());
        experience.setLocation(request.getLocation());
        experience.setStartDate(request.getStartDate());
        experience.setEndDate(request.getEndDate());
        experience.setCurrentlyWorking(request.getCurrentlyWorking());
        experience.setDescription(request.getDescription());

        // Save Entity
        return experienceRepository.save(experience);
    }

    // Get All Experiences
    @Override
    public List<Experience> getAllExperiences() {
        return experienceRepository.findAll();
    }

    // Get Experience By ID
    @Override
    public Experience getExperienceById(Long id) {

        return experienceRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Experience not found with id: " + id
                        )
                );
    }

    // Delete Experience
    @Override
    public void deleteById(Long id) {
        experienceRepository.deleteById(id);
    }
}