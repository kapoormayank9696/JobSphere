package com.jobportal.jobsphere.dto.skill;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class SkillUpdateRequest {

    @Size (
            max = 100,
            message = "Skill name cannot exceed 100 characters"
    )
    private String skillName;

    @Size(
            max = 100,
            message = "Description cannot exceed 100 characters"
    )
    private String description;

}
