package com.jobportal.jobsphere.Repository;

import com.jobportal.jobsphere.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface UserRepository extends JpaRepository<User,BigInteger> {}
