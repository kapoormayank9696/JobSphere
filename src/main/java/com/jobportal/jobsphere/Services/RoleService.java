package com.jobportal.jobsphere.Services;

import com.jobportal.jobsphere.Entity.Role;

import java.util.List;

public interface RoleService {

    Role rolesSaver(Role roles);
    List<Role> getAllRoles();
    Role getById(int id);
    void deleteById(int id);

}
