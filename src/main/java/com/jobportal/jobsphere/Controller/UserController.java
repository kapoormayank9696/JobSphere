package com.jobportal.jobsphere.Controller;

import com.jobportal.jobsphere.dto.user.UserResponse;
import com.jobportal.jobsphere.dto.user.UserUpdateRequest;
import com.jobportal.jobsphere.entity.User;
import com.jobportal.jobsphere.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")

public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> getUserById(@PathVariable Long id
            , @Valid @RequestBody UserUpdateRequest request) {
        User user = userService.getUserById(id);
        UserResponse response = new UserResponse(
                user.getId(),
                user.getFullName(),
                user.getEmail(),
                user.getPhone(),
                user.getRole()
        );
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable  Long id) {
        userService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
