package com.jobportal.jobsphere.Services;

import com.jobportal.jobsphere.Entity.UserSkill;

import java.util.List;

public interface UserSkillService {

    UserSkill saveUserSkill(UserSkill userSkill);

    List<UserSkill> getAllUserSkills();

    UserSkill getUserSkillById(Long userId, Long skillId);

    void deleteUserSkill(Long userId, Long skillId);
}