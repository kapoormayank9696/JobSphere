package com.jobportal.jobsphere.repository;

import com.jobportal.jobsphere.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job,Long> {}
