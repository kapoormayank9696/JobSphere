package com.jobportal.jobsphere.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface RolesRepository extends JpaRepository<Roles, BigInteger>{
}
