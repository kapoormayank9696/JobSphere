package com.jobportal.jobsphere.service.impl;

import com.jobportal.jobsphere.exception.ResourceNotFoundException;
import com.jobportal.jobsphere.entity.Job;
import com.jobportal.jobsphere.repository.JobRepository;
import com.jobportal.jobsphere.service.JobService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
        return jobRepository.findById(id).
                orElseThrow(() -> new
                        ResourceNotFoundException("Job not found with id: "+id));
    }

    @Override
    public void deleteById(Long id) {
        jobRepository.deleteById(id);
    }
}
