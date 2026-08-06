package com.jobportal.jobsphere.Services;

import com.jobportal.jobsphere.Entity.Company;

import java.util.List;

public interface CompanyServices {
    Company companySaver(Company company);
    List<Company> getAllCompany();
    Company getById(int id);
    void deleteById(int id);
}
