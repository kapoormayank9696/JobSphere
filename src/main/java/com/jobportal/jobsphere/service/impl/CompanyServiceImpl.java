package com.jobportal.jobsphere.service.impl;

import com.jobportal.jobsphere.entity.Company;
import com.jobportal.jobsphere.repository.CompanyRepository;
import com.jobportal.jobsphere.service.CompanyService;

import java.util.List;

public class CompanyServiceImpl implements CompanyService {

    // Data Member with final Keyword
    private final CompanyRepository companyRepository;

    // Parameterized Constructor
    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public Company saveCompany(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public Company getCompanyById(Long id) {
        return companyRepository.getReferenceById(id);
    }

    @Override
    public void deleteById(Long id) {
        companyRepository.deleteById(id);
    }
}
