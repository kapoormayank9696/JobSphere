package com.jobportal.jobsphere.Repository;

import com.jobportal.jobsphere.Entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface EducationRepository extends JpaRepository<Education, BigInteger> {}
