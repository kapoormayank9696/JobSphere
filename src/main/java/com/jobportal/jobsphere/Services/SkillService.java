package com.jobportal.jobsphere.Services;

import com.jobportal.jobsphere.Entity.Skill;

import java.util.List;

public interface SkillService {

    Skill saveSkill(Skill skill);

    List<Skill> getAllSkills();

    Skill getSkillById(Long id);

    void deleteById(Long id);

}
