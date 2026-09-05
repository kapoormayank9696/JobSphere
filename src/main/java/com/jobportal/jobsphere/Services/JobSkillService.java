package com.jobportal.jobsphere.Services;

import com.jobportal.jobsphere.Entity.JobSkill;

import java.util.List;

public interface JobSkillService {

    JobSkill saveJobSkill(JobSkill jobSkill);

    List<JobSkill> getAllJobSkills();

    JobSkill getJobSkillById(Long jobId, Long skillId);

    void deleteJobSkill(Long jobId, Long skillId);
}
