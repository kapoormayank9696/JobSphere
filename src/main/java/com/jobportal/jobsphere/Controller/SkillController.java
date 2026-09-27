package com.jobportal.jobsphere.Controller;

import com.jobportal.jobsphere.dto.skill.SkillResponse;
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
import java.util.stream.Collectors;

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
    public ResponseEntity<List<SkillResponse>> getAllSkills() {
        List<Skill> skills = skillService.getAllSkills();
        List<SkillResponse> responses = skills.stream().map(
                skill -> new SkillResponse(
                        skill.getId(),
                        skill.getSkillName(),
                        skill.getDescription()
                ))
                .collect(Collectors.toList());
        return ResponseEntity.ok(responses);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SkillResponse> getSkillById(@PathVariable Long id) {
        Skill skill = skillService.getSkillById(id);
        SkillResponse response = new SkillResponse(
                skill.getId(),
                skill.getSkillName(),
                skill.getDescription()
        );
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        skillService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
