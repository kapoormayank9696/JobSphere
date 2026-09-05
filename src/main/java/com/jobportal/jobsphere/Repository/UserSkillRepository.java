package com.jobportal.jobsphere.Repository;

import com.jobportal.jobsphere.Entity.UserSkill;
import com.jobportal.jobsphere.Entity.UserSkillId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSkillRepository extends JpaRepository<UserSkill, UserSkillId> {
}
