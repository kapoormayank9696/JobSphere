package com.jobportal.jobsphere.Controller;

import com.jobportal.jobsphere.dto.userskill.UserSkillResponse;
import com.jobportal.jobsphere.entity.UserSkill;
import com.jobportal.jobsphere.service.UserSkillService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")

public class UserSkillController {
    private final UserSkillService userSkillService;

    public UserSkillController(UserSkillService userSkillService) {
        this.userSkillService = userSkillService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserSkillResponse> getUserSkillById(@PathVariable Long userId,Long skillId) {
        UserSkill userSkill = userSkillService.getUserSkillById(userId,skillId);

        UserSkillResponse response = new UserSkillResponse(
                userSkill.getUser().getId(),
                userSkill.getSkill().getId(),
                userSkill.getProficiencyLevel(),
                userSkill.getYearsOfExperience()
        );
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable  Long userId, Long skillId) {
        userSkillService.deleteUserSkill(userId,skillId);
        return ResponseEntity.noContent().build();
    }
}
