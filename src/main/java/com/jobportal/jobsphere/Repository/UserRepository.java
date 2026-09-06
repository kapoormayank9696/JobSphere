package com.jobportal.jobsphere.Repository;

import com.jobportal.jobsphere.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {}
