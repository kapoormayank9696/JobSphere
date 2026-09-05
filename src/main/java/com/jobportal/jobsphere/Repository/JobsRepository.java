package com.jobportal.jobsphere.Repository;

import com.jobportal.jobsphere.Entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobsRepository extends JpaRepository<Job,Long> {}
