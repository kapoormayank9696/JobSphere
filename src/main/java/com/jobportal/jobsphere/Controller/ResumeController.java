package com.jobportal.jobsphere.Controller;

import com.jobportal.jobsphere.dto.resume.ResumeResponse;
import com.jobportal.jobsphere.entity.Resume;
import com.jobportal.jobsphere.service.ResumeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/resumes")

public class ResumeController {
    private final ResumeService resumeService;

    public ResumeController(ResumeService resumeService) {
        this.resumeService = resumeService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResumeResponse> getResumeById(@PathVariable Long id) {
        Resume resume = resumeService.getResumeById(id);
        ResumeResponse response = new ResumeResponse(
                resume.getId(),
                resume.getUser().getId(),
                resume.getResumeName(),
                resume.getFileName(),
                resume.getFileUrl(),
                resume.getCreatedAt().getDayOfMonth()
        );
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable  Long id) {
        resumeService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
