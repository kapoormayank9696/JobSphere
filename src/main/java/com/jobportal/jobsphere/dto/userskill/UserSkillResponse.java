package com.jobportal.jobsphere.dto.userskill;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UserSkillResponse {

    private Long userId;
    private Long skillId;
    private String proficiencyLevel;
    private BigDecimal yearsOfExperience;

}
