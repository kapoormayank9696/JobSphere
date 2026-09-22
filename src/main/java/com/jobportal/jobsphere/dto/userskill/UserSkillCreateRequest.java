package com.jobportal.jobsphere.dto.userskill;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UserSkillCreateRequest {

    @NotNull(message = "User id is required")
    private Long userId;

    @NotNull(message = "Skill id is required")
    private Long skillId;

    @NotBlank(message = "Proficiency level is required")
    @Size (
            max = 50,
            message = "Proficiency level cannot exceed 50 characters"
    )
    private String proficiencyLevel;

    @NotNull(message = "Years of experience is required")
    @DecimalMin(
            value = "0.00",
            message = "Years of experience cannot be less than 0"
    )
    @DecimalMax(
            value = "4.00",
            message = "Years of experience cannot exceed 4"
    )
    private BigDecimal yearsOfExperience;

}
