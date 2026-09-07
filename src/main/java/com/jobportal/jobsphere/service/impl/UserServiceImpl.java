package com.jobportal.jobsphere.service.impl;

import com.jobportal.jobsphere.exception.ResourceNotFoundException;
import com.jobportal.jobsphere.entity.User;
import com.jobportal.jobsphere.repository.UserRepository;
import com.jobportal.jobsphere.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("User not found with id: " + id));
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email)
                .orElseThrow(() ->
                        new RuntimeException("User not found with email: " + email));
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
