package com.jobportal.jobsphere.service.impl;

import com.jobportal.jobsphere.entity.Resume;
import com.jobportal.jobsphere.repository.ResumeRepository;
import com.jobportal.jobsphere.service.ResumeService;

import java.util.List;

public class ResumeServiceImpl implements ResumeService {

    // Data Members with final Keyword
    private final ResumeRepository resumeRepository;

    // Parameterized Constructor
    public ResumeServiceImpl(ResumeRepository resumeRepository) {
        this.resumeRepository = resumeRepository;
    }

    @Override
    public Resume saveResume(Resume resume) {
        return resumeRepository.save(resume);
    }

    @Override
    public List<Resume> getAllResumes() {
        return resumeRepository.findAll();
    }

    @Override
    public Resume getResumeById(Long id) {
        return resumeRepository.getReferenceById(id);
    }

    @Override
    public void deleteById(Long id) {
        resumeRepository.deleteById(id);
    }
}
