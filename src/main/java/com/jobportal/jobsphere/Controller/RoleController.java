package com.jobportal.jobsphere.Controller;

import com.jobportal.jobsphere.dto.role.RoleResponse;
import com.jobportal.jobsphere.dto.role.RoleUpdateRequest;
import com.jobportal.jobsphere.entity.Role;
import com.jobportal.jobsphere.service.RoleService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/roles")
public class RoleController {
    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("{id}")
    public ResponseEntity<RoleResponse> getRoleById(@PathVariable Long id
            , @Valid @RequestBody RoleUpdateRequest request) {
        Role role = roleService.getRoleById(id);
        
        if (request.getRoleName() != null) {
            role.setRoleName(request.getRoleName());
        }

        if (request.getDescription() != null) {
            role.setDescription(request.getDescription());
        }


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
