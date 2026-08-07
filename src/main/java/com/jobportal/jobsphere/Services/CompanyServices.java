package com.jobportal.jobsphere.Services;

import com.jobportal.jobsphere.Entity.Company;

import java.util.List;

public interface CompanyServices {
    Company saveCompany(Company company);
    List<Company> getAllCompany();
    Company getById(Long id);
    void deleteById(int id);
}
