package com.jobportal.jobsphere.controller;

import com.jobportal.jobsphere.dto.experience.ExperienceCreateRequest;
import com.jobportal.jobsphere.dto.experience.ExperienceResponse;
import com.jobportal.jobsphere.entity.Experience;
import com.jobportal.jobsphere.service.ExperienceService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/experience")

public class ExperienceController {
    private final ExperienceService experienceService;

    public ExperienceController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    @PostMapping
    public ResponseEntity<ExperienceResponse> saveExperience(
            @Valid @RequestBody ExperienceCreateRequest request) {
        Experience experience = experienceService.saveExperience(request);
        ExperienceResponse response = new ExperienceResponse(
                experience.getId(),
                experience.getUser().getId(),
                experience.getCompanyName(),
                experience.getJobTitle(),
                experience.getEmployeeType(),
                experience.getLocation(),
                experience.getStartDate().getDayOfYear(),
                experience.getEndDate().getDayOfYear(),
                experience.getCurrentlyWorking(),
                experience.getDescription()
        );
        return ResponseEntity.ok(response);
    }

    @GetMapping()
    public ResponseEntity<List<ExperienceResponse>> getAllExperience() {
        List<Experience> experiences = experienceService.getAllExperiences();
        List<ExperienceResponse> responses = experiences.stream().map(
                experience -> new ExperienceResponse(
                        experience.getId(),
                        experience.getUser().getId(),
                        experience.getCompanyName(),
                        experience.getJobTitle(),
                        experience.getEmployeeType(),
                        experience.getLocation(),
                        experience.getStartDate().getDayOfYear(),
                        experience.getEndDate().getDayOfYear(),
                        experience.getCurrentlyWorking(),
                        experience.getDescription()
                ))
                .collect(Collectors.toList());

        return ResponseEntity.ok(responses);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExperienceResponse> getExperienceById(@PathVariable Long id) {
        Experience experience = experienceService.getExperienceById(id);
        ExperienceResponse response = new ExperienceResponse(
                experience.getId(),
                experience.getUser().getId(),
                experience.getCompanyName(),
                experience.getJobTitle(),
                experience.getEmployeeType(),
                experience.getLocation(),
                experience.getStartDate().getDayOfYear(),
                experience.getEndDate().getDayOfYear(),
                experience.getCurrentlyWorking(),
                experience.getDescription()
        );
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable  Long id) {
        experienceService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
