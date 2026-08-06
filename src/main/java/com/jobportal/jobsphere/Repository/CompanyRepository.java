package com.jobportal.jobsphere.Repository;

import com.jobportal.jobsphere.Entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface CompanyRepository extends JpaRepository<Company, BigInteger> {}
