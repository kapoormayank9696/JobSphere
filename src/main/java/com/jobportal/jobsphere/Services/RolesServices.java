package com.jobportal.jobsphere.Services;

import com.jobportal.jobsphere.Entity.Roles;

import java.util.List;

public interface RolesServices {
    Roles rolesSaver(Roles roles);
    List<Roles> getAllRoles();
    Roles getById(int id);
    void deleteById(int id);
}
