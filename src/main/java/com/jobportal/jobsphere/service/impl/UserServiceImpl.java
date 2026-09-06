package com.jobportal.jobsphere.service.impl;

import com.jobportal.jobsphere.entity.User;
import com.jobportal.jobsphere.repository.UserRepository;
import com.jobportal.jobsphere.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    // Data Members with final Keyword
    private final UserRepository userRepository;

    // Parameterized constructor
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
        return userRepository.getReferenceById(id);
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.findBy(email);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
