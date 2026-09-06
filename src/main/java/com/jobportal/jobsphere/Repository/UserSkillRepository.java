package com.jobportal.jobsphere.Repository;

import com.jobportal.jobsphere.entity.UserSkill;
import com.jobportal.jobsphere.entity.UserSkillId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSkillRepository extends JpaRepository<UserSkill, UserSkillId> {
}
