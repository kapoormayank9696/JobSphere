package com.jobportal.jobsphere.dto.userskill;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UserSkillUpdateRequest {

    private Long skillId;

    @Size(
            max = 50,
            message = "Proficiency level cannot exceed 50 characters"
    )
    private String proficiencyLevel;

    @DecimalMin(
            value = "0.00",
            message = "Year of experience cannot be exceed 4"
    )
    private BigDecimal yearsOfExperience;

}
