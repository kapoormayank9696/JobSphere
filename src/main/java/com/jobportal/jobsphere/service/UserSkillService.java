package com.jobportal.jobsphere.service;

import com.jobportal.jobsphere.dto.userskill.UserSkillCreateRequest;
import com.jobportal.jobsphere.entity.UserSkill;
import jakarta.validation.Valid;

import java.util.List;

public interface UserSkillService {

    UserSkill saveUserSkill(@Valid UserSkillCreateRequest userSkill);

    List<UserSkill> getAllUserSkills();

    UserSkill getUserSkillById(Long userId, Long skillId);

    void deleteUserSkill(Long userId, Long skillId);
}