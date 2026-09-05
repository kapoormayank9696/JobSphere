package com.jobportal.jobsphere.Services;

import com.jobportal.jobsphere.Entity.Role;
import java.util.List;

public interface RoleService {

    Role saveRole(Role role);

    List<Role> getAllRoles();

    Role getRoleById(Long id);

    void deleteById(Long id);

}
