package com.jobportal.jobsphere.Repository;

import com.jobportal.jobsphere.Entity.JobSkill;
import com.jobportal.jobsphere.Entity.JobSkillId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSkillRepository extends JpaRepository<JobSkill, JobSkillId> {}
