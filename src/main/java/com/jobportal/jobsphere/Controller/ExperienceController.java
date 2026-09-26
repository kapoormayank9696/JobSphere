package com.jobportal.jobsphere.Controller;

import com.jobportal.jobsphere.dto.experience.ExperienceResponse;
import com.jobportal.jobsphere.entity.Experience;
import com.jobportal.jobsphere.service.ExperienceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/experience")

public class ExperienceController {
    private final ExperienceService experienceService;

    public ExperienceController(ExperienceService experienceService) {
        this.experienceService = experienceService;
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
