package com.jobportal.jobsphere.Repository;

import com.jobportal.jobsphere.Entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {}
