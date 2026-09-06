package com.jobportal.jobsphere.service;

import com.jobportal.jobsphere.entity.Role;
import java.util.List;

public interface RoleService {

    Role saveRole(Role role);

    List<Role> getAllRoles();

    Role getRoleById(Long id);

    void deleteById(Long id);

}
