package com.jobportal.jobsphere.Services;

import com.jobportal.jobsphere.Entity.User;

import java.util.List;

public interface UserServices {
    User userSaver(User user);
    List<User> getAllUser();
    User getUserById(int id);
    void deleteById(int id);
}
