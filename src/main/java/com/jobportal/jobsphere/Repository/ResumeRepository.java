package com.jobportal.jobsphere.Repository;

import com.jobportal.jobsphere.entity.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumeRepository extends JpaRepository<Resume,Long> {}
