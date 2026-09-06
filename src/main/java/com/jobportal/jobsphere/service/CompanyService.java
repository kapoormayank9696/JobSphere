package com.jobportal.jobsphere.service;

import com.jobportal.jobsphere.entity.Company;
import java.util.List;

public interface CompanyService {

    Company saveCompany(Company company);

    List<Company> getAllCompanies();

    Company getCompanyById(Long id);

    void deleteById(Long id);

}
