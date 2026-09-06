package com.jobportal.jobsphere.service.impl;

import com.jobportal.jobsphere.entity.Role;
import com.jobportal.jobsphere.repository.RoleRepository;
import com.jobportal.jobsphere.service.RoleService;

import java.util.List;

public class RoleServiceImpl implements RoleService {

    // Data Members with final Keyword
    private final RoleRepository roleRepository;

    // Parameterized Constructor
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role getRoleById(Long id) {
        return roleRepository.getReferenceById(id);
    }

    @Override
    public void deleteById(Long id) {
        roleRepository.deleteById(id);
    }
}
