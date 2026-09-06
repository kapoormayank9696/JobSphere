package com.jobportal.jobsphere.service;

import com.jobportal.jobsphere.entity.Resume;

import java.util.List;

public interface ResumeService {

    Resume saveResume(Resume resume);

    List<Resume> getAllResumes();

    Resume getResumeById(Long id);

    void deleteById(Long id);
}
