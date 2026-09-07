package com.jobportal.jobsphere.service.impl;

import com.jobportal.jobsphere.exception.ResourceNotFoundException;
import com.jobportal.jobsphere.entity.JobSkill;
import com.jobportal.jobsphere.entity.JobSkillId;
import com.jobportal.jobsphere.repository.JobSkillRepository;
import com.jobportal.jobsphere.service.JobSkillService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
        JobSkillId id = new JobSkillId(jobId,skillId);
        return jobSkillRepository.findById(id).
                orElseThrow(() -> new
                        ResourceNotFoundException("JobSkill not found for jobId: "+jobId+"and skillId:  "+ skillId));
    }

    @Override
    public void deleteJobSkill(Long jobId, Long skillId) {
        JobSkillId id = new JobSkillId(jobId, skillId);
        jobSkillRepository.deleteById(id);
    }
}
