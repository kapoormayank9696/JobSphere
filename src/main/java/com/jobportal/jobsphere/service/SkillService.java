package com.jobportal.jobsphere.service;

import com.jobportal.jobsphere.entity.Skill;
import java.util.List;

public interface SkillService {

    Skill saveSkill(Skill skill);

    List<Skill> getAllSkills();

    Skill getSkillById(Long id);

    void deleteById(Long id);

}
