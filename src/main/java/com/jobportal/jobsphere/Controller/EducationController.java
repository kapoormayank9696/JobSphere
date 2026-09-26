package com.jobportal.jobsphere.Controller;

import com.jobportal.jobsphere.dto.education.EducationResponse;
import com.jobportal.jobsphere.entity.Education;
import com.jobportal.jobsphere.service.EducationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/educations")

public class EducationController {
    private final EducationService educationService;

    public EducationController(EducationService educationService) {
        this.educationService = educationService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<EducationResponse> getEducationById(@PathVariable Long id) {
        Education education = educationService.getEducationById(id);
        EducationResponse response = new EducationResponse(
                education.getId(),
                education.getUser().getId(),
                education.getInstituteName(),
                education.getDegree(),
                education.getFieldOfStudy(),
                education.getStartYear(),
                education.getEndYear(),
                education.getPercentage()
        );
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        educationService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
