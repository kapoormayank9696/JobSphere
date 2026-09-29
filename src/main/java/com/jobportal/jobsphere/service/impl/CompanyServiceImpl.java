package com.jobportal.jobsphere.service.impl;

import com.jobportal.jobsphere.dto.company.CompanyCreateRequest;
import com.jobportal.jobsphere.entity.Company;
import com.jobportal.jobsphere.exception.ResourceNotFoundException;
import com.jobportal.jobsphere.repository.CompanyRepository;
import com.jobportal.jobsphere.service.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    // CREATE COMPANY
    @Override
    public Company saveCompany(CompanyCreateRequest request) {

        Company company = new Company();

        company.setCompanyName(request.getCompanyName());
        company.setDescription(request.getDescription());
        company.setIndustry(request.getIndustry());
        company.setWebsite(request.getWebsite());
        company.setEmail(request.getEmail());
        company.setPhone(request.getPhone());
        company.setLocation(request.getLocation());
        company.setAddress(request.getAddress());
        company.setCity(request.getCity());
        company.setState(request.getState());
        company.setCountry(request.getCountry());
        company.setPostalCode(request.getPostalCode());
        company.setCompanySize(request.getCompanySize());
        company.setFoundedYear(request.getFoundedYear());

        return companyRepository.save(company);
    }

    // GET ALL COMPANIES
    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    // GET COMPANY BY ID
    @Override
    public Company getCompanyById(Long id) {

        return companyRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Company not found with id: " + id
                        )
                );
    }

    // DELETE COMPANY
    @Override
    public void deleteById(Long id) {
        companyRepository.deleteById(id);
    }
}