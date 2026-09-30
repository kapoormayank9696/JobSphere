package com.jobportal.jobsphere.service.impl;

import com.jobportal.jobsphere.dto.education.EducationCreateRequest;
import com.jobportal.jobsphere.exception.ResourceNotFoundException;
import com.jobportal.jobsphere.entity.Education;
import com.jobportal.jobsphere.repository.EducationRepository;
import com.jobportal.jobsphere.service.EducationService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationServiceImpl implements EducationService {

    // Data Members with final Keyword
    private final EducationRepository educationRepository;

    // Parameterized Constructor
    public EducationServiceImpl(EducationRepository educationRepository) {
        this.educationRepository = educationRepository;
    }

    @Override
    public Education saveEducation(EducationCreateRequest request) {
        Education education = new Education();

        education.setUser(request.getUserId());
        education.setDegree(request.getDegree());
        education.setFieldOfStudy(request.getFieldOfStudy());
        education.setInstituteName(request.getInstituteName());
        education.setPercentage(request.getPercentage());
        education.setStartYear(request.getStartYear());
        education.setEndYear(request.getEndYear());
        return educationRepository.save(education);
    }

    @Override
    public List<Education> getAllEducations() {
        return educationRepository.findAll();
    }

    @Override
    public Education getEducationById(Long id) {
        return educationRepository.findById(id).
                orElseThrow(() -> new
                        ResourceNotFoundException("Education not found with id: " + id));
    }

    @Override
    public void deleteById(Long id) {
        educationRepository.deleteById(id);
    }
}
