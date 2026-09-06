package com.jobportal.jobsphere.Services;

import com.jobportal.jobsphere.entity.User;
import java.util.List;

public interface UserService {

    User saveUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    void deleteById(Long id);
}
