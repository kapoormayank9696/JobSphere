package com.jobportal.jobsphere.repository;

import com.jobportal.jobsphere.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {}
