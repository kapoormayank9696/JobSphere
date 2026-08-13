package com.jobportal.jobsphere.Services;

import com.jobportal.jobsphere.Repository.UserRolesRepository;

import java.util.List;

public interface UserRolesServices {

    UserRolesRepository saveUserRoles(UserRolesRepository userRolesRepository);
    List<UserRolesRepository> getAllUsers();
    UserRolesRepository getUserRolesById(int id);
    void deleteById(int id);

}
