package com.jobportal.jobsphere.service.impl;

import com.jobportal.jobsphere.entity.UserSkill;
import com.jobportal.jobsphere.repository.UserSkillRepository;
import com.jobportal.jobsphere.service.UserSkillService;

import java.util.List;

public class UserSkillServiceImpl implements UserSkillService {

    // Data Members with final Keyword
    private final UserSkillRepository userSkillRepository;

    // Parameterized Constructor
    public UserSkillServiceImpl(UserSkillRepository userSkillRepository) {
        this.userSkillRepository = userSkillRepository;
    }

    @Override
    public UserSkill saveUserSkill(UserSkill userSkill) {
        return userSkillRepository.save(userSkill);
    }

    @Override
    public List<UserSkill> getAllUserSkills() {
        return userSkillRepository.findAll();
    }

    @Override
    public UserSkill getUserSkillById(Long userId, Long skillId) {
        return userSkillRepository.getReferenceById(userId,skillId);
    }

    @Override
    public void deleteUserSkill(Long userId, Long skillId) {
        userSkillRepository.deleteById(userId,skillId);
    }
}
