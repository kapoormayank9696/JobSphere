package com.jobportal.jobsphere.service;

import com.jobportal.jobsphere.dto.company.CompanyCreateRequest;
import com.jobportal.jobsphere.entity.Company;
import jakarta.validation.Valid;

import java.util.List;

public interface CompanyService {

    Company saveCompany(@Valid CompanyCreateRequest company);

    List<Company> getAllCompanies();

    Company getCompanyById(Long id);

    void deleteById(Long id);

}
