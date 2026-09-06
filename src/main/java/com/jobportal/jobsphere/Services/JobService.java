package com.jobportal.jobsphere.Services;

import com.jobportal.jobsphere.entity.Job;

import java.util.List;

public interface JobService {

    Job saveJob(Job job);

    List<Job> getAllJobs();

    Job getJobById(Long id);

    void deleteById(Long id);
}
