package com.jobportal.jobsphere.dto.resume;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class ResumeResponse {

    private Long id;
    private Long userId;
    private String resumeName;
    private String fileName;
    private String fileUrl;
    private Integer isDefault;

}
