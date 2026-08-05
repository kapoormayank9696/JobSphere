package com.jobportal.jobsphere.Repository;

import com.jobportal.jobsphere.Entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface RolesRepository extends JpaRepository<Roles, BigInteger>{
}
