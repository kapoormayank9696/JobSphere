package com.jobportal.jobsphere.Controller;

import com.jobportal.jobsphere.dto.role.RoleResponse;
import com.jobportal.jobsphere.entity.Role;
import com.jobportal.jobsphere.service.RoleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/roles")
public class RoleController {

    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    public ResponseEntity<List<RoleResponse>> getAllRoles() {
        List<Role> roles = roleService.getAllRoles();
        List<RoleResponse> responses = roles.stream().map(
                role -> new RoleResponse(
                        role.getId(),
                        role.getRoleName(),
                        role.getDescription()
                ))
                .collect(Collectors.toList());
        return ResponseEntity.ok(responses);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RoleResponse> getRoleById(@PathVariable Long id) {
        Role role = roleService.getRoleById(id);

        RoleResponse response = new RoleResponse(
                role.getId(),
                role.getRoleName(),
                role.getDescription()
        );

        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        roleService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
