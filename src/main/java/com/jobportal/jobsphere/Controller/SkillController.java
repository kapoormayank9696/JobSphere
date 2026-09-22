package com.jobportal.jobsphere.Controller;

import com.jobportal.jobsphere.entity.Skill;
import com.jobportal.jobsphere.service.SkillService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
@RequestMapping("api/skills")
public class SkillController {
    private final SkillService skillService;

    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    @PostMapping
    public Skill addSkill(@RequestBody Skill skill) {
        return skillService.saveSkill(skill);
    }

    @GetMapping
    public List<Skill> getAllSkill() {
        return skillService.getAllSkills();
    }

    @GetMapping("/{id}")
    public Skill getById(@PathVariable Long id) {
        return skillService.getSkillById(id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        skillService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
