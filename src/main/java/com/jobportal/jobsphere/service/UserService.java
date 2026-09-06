package com.jobportal.jobsphere.service;

import com.jobportal.jobsphere.entity.User;
import java.util.List;

public interface UserService {

    User saveUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    User getUserByEmail(String email);

    void deleteById(Long id);
}
