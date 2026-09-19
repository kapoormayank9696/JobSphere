package com.jobportal.jobsphere.dto.jobskill;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class JobSkillCreateRequest {

    @NotNull(message = "Job id is required")
    private Long jobId;

    @NotNull(message = "Skill id is required")
    private Long skillId;
}
