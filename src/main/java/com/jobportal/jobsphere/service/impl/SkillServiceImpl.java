package com.jobportal.jobsphere.service.impl;

import com.jobportal.jobsphere.entity.Skill;
import com.jobportal.jobsphere.repository.SkillRepository;
import com.jobportal.jobsphere.service.SkillService;

import java.util.List;

public class SkillServiceImpl implements SkillService {

    // Data Members with final Keyword
    private final SkillRepository skillRepository;

    // Parameterized Constructor
    public SkillServiceImpl(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    @Override
    public Skill saveSkill(Skill skill) {
        return skillRepository.save(skill);
    }

    @Override
    public List<Skill> getAllSkills() {
        return skillRepository.findAll();
    }

    @Override
    public Skill getSkillById(Long id) {
        return skillRepository.getReferenceById(id);
    }

    @Override
    public void deleteById(Long id) {
        skillRepository.deleteById(id);
    }
}
