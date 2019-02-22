package com.twitte.twitter.service;

import com.twitte.twitter.model.User;
import com.twitte.twitter.repository.UserRepository;

import org.springframework.stereotype.Service;

@Service
public class UserSevice {
    private final UserRepository userRepository;

    public UserSevice(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User create(User user) {
        return userRepository.save(user);
    }
}
