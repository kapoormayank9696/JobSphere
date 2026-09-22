package com.jobportal.jobsphere.dto.skill;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class SkillResponse {

    private Long id;
    private String skillName;
    private String description;

}
