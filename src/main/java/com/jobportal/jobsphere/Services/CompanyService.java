package com.jobportal.jobsphere.Services;

import com.jobportal.jobsphere.Entity.Company;
import java.util.List;

public interface CompanyService {

    Company saveCompany(Company company);

    List<Company> getAllCompanies();

    Company getById(Long id);

    void deleteById(Long id);

}
