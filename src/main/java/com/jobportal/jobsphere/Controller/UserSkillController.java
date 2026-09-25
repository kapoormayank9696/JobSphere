package com.jobportal.jobsphere.Controller;

import com.jobportal.jobsphere.dto.userskill.UserSkillResponse;
import com.jobportal.jobsphere.entity.UserSkill;
import com.jobportal.jobsphere.service.UserSkillService;
import jakarta.validation.Valid;
import org.springframework.boot.actuate.web.exchanges.HttpExchange;
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
    public ResponseEntity<UserSkillResponse> getUserSkillById(@PathVariable Long id,
    @Valid @RequestBody UserSkillUpdateRequest request) {
        UserSkill userSkill = userSkillService.getUserSkillById(id);

        UserSkillResponse response = new UserSkillResponse(
                userSkill.getId(),
                userSkill.getUser(),
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
