package com.jobportal.jobsphere.service.impl;

import com.jobportal.jobsphere.entity.UserSkill;
import com.jobportal.jobsphere.entity.UserSkillId;
import com.jobportal.jobsphere.repository.UserSkillRepository;
import com.jobportal.jobsphere.service.UserSkillService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
        UserSkillId id = new UserSkillId(userId, skillId);
        return userSkillRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException(
                                "User Skill not found with userId: " + userId +
                                        " and skillId: " + skillId
                        )
                );
    }

    @Override
    public void deleteUserSkill(Long userId, Long skillId) {
        UserSkillId id = new UserSkillId(userId,skillId);
        userSkillRepository.deleteById(id);
    }
}
