package com.jobportal.jobsphere.Repository;

import com.jobportal.jobsphere.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {}
