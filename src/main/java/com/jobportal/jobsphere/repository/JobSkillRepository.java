package com.jobportal.jobsphere.repository;

import com.jobportal.jobsphere.entity.JobSkill;
import com.jobportal.jobsphere.entity.JobSkillId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSkillRepository extends JpaRepository<JobSkill, JobSkillId> {}
