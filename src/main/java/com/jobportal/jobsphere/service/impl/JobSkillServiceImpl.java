package com.jobportal.jobsphere.service.impl;

import com.jobportal.jobsphere.entity.JobSkill;
import com.jobportal.jobsphere.repository.JobSkillRepository;
import com.jobportal.jobsphere.service.JobSkillService;

import java.util.List;

public class JobSkillServiceImpl implements JobSkillService {

    // Data Members with final Keyword
    private final JobSkillRepository jobSkillRepository;

    // Parameterized Constructor
    public JobSkillServiceImpl(JobSkillRepository jobSkillRepository) {
        this.jobSkillRepository = jobSkillRepository;
    }

    @Override
    public JobSkill saveJobSkill(JobSkill jobSkill) {
        return jobSkillRepository.save(jobSkill);
    }

    @Override
    public List<JobSkill> getAllJobSkills() {
        return jobSkillRepository.findAll();
    }

    @Override
    public JobSkill getJobSkillById(Long jobId, Long skillId) {
        return jobSkillRepository.getReferenceById(jobId,skillId);
    }

    @Override
    public void deleteJobSkill(Long jobId, Long skillId) {
        jobSkillRepository.deleteById(jobId,skillId);
    }
}
