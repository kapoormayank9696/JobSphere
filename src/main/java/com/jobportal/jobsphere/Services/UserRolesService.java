package com.jobportal.jobsphere.Services;

import com.jobportal.jobsphere.Repository.UserRolesRepository;
import java.util.List;

public interface UserRolesService {

    UserRolesRepository saveUserRoles(UserRolesRepository userRolesRepository);

    List<UserRolesRepository> getAllUserRoles();

    UserRolesRepository getUserRoleById(Long id);

    void deleteById(Long id);

}
