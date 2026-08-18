package com.jobportal.jobsphere.Repository;

import com.jobportal.jobsphere.Entity.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobsRepository extends JpaRepository<Jobs,Long> {}
