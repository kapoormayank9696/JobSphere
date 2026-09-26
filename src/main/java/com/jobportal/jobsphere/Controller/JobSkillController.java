package com.jobportal.jobsphere.Controller;

import com.jobportal.jobsphere.dto.jobskill.JobSkillResponse;
import com.jobportal.jobsphere.entity.JobSkill;
import com.jobportal.jobsphere.service.JobService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/jobSkills")

public class JobSkillController {
    private final JobService jobService;

    public JobSkillController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<JobSkillResponse> getJobSkillById(@PathVariable Long id) {
        JobSkill jobSkill = jobService.getJobSkillById(id);
        JobSkillResponse response = new JobSkillResponse(
                jobSkill.getJob().getId(),
                jobSkill.getSkill().getId()
        );
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable  Long id) {
        jobService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
