package com.jobportal.jobsphere.service.impl;

import com.jobportal.jobsphere.entity.Job;
import com.jobportal.jobsphere.repository.JobRepository;
import com.jobportal.jobsphere.service.JobService;

import java.util.List;

public class JobServiceImpl implements JobService {

    // Data Members with final Keyword
    private final JobRepository jobRepository;

    // Parameterized Constructor
    public JobServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public Job saveJob(Job job) {
        return jobRepository.save(job);
    }

    @Override
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    @Override
    public Job getJobById(Long id) {
        return jobRepository.getReferenceById(id);
    }

    @Override
    public void deleteById(Long id) {
        jobRepository.deleteById(id);
    }
}
