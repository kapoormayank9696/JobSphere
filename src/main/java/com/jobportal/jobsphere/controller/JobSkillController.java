package com.jobportal.jobsphere.controller;

import com.jobportal.jobsphere.dto.jobskill.JobSkillResponse;
import com.jobportal.jobsphere.entity.JobSkill;
import com.jobportal.jobsphere.service.JobSkillService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/jobSkills")

public class JobSkillController {
    private final JobSkillService jobSkillService;

    public JobSkillController(JobSkillService jobSkillService) {
        this.jobSkillService = jobSkillService;
    }

    @GetMapping()
    public ResponseEntity<List<JobSkillResponse>> getAllJobSkills() {
        List<JobSkill> jobSkills = jobSkillService.getAllJobSkills();
        List<JobSkill> responses = jobSkills.stream().map(
                jobSkill -> new JobSkillResponse(
                        jobSkill.getJob().getId(),
                        jobSkill.getSkill().getId()
                ))
                .collect(Collectors.toList());
        return ResponseEntity.ok(responses);
    }

    @GetMapping("/{id}")
    public ResponseEntity<JobSkillResponse> getJobSkillById(@PathVariable Long jobId, Long skillId) {
        JobSkill jobSkill = jobSkillService.getJobSkillById(jobId,skillId);
        JobSkillResponse response = new JobSkillResponse(
                jobSkill.getJob().getId(),
                jobSkill.getSkill().getId()
        );
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long jobId, Long skillId) {
        jobSkillService.deleteById(jobId,skillId);
        return ResponseEntity.noContent().build();
    }
}
