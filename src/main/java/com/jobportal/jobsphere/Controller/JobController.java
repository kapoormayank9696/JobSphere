package com.jobportal.jobsphere.Controller;

import com.jobportal.jobsphere.dto.job.JobResponse;
import com.jobportal.jobsphere.entity.Job;
import com.jobportal.jobsphere.service.JobService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/jobs")

public class JobController {
    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<JobResponse> getJobById(@PathVariable Long id) {
        Job job = jobService.getJobById(id);
        JobResponse response = new JobResponse(
                job.getId(),
                job.getCompany().getId(),
                job.getTitle(),
                job.getDescription(),
                job.getRequirements(),
                job.getEmploymentType(),
                job.getExperienceLevel(),
                job.getSalaryMin(),
                job.getSalaryMax(),
                job.getLocation(),
                job.getCity(),
                job.getState(),
                job.getCountry(),
                job.isRemote(),
                job.getStatus(),
                job.getDeadline().getDayOfMonth()
        );
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable  Long id) {
        jobService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
