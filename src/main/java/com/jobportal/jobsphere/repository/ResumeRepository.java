package com.jobportal.jobsphere.repository;

import com.jobportal.jobsphere.entity.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumeRepository extends JpaRepository<Resume,Long> {}
