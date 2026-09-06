package com.jobportal.jobsphere.service;

import com.jobportal.jobsphere.entity.JobSkill;

import java.util.List;

public interface JobSkillService {

    JobSkill saveJobSkill(JobSkill jobSkill);

    List<JobSkill> getAllJobSkills();

    JobSkill getJobSkillById(Long jobId, Long skillId);

    void deleteJobSkill(Long jobId, Long skillId);
}
