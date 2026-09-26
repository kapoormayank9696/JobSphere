package com.jobportal.jobsphere.service;

import com.jobportal.jobsphere.entity.Job;
import com.jobportal.jobsphere.entity.JobSkill;

import java.util.List;

public interface JobService {

    Job saveJob(Job job);

    List<Job> getAllJobs();

    JobSkill getJobSkillById(Long id);

    void deleteById(Long id);
    
}
