package com.jobportal.jobsphere.Repository;

import com.jobportal.jobsphere.Entity.User_Skills;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSkillRepository extends JpaRepository<User_Skills,Long> {
}
