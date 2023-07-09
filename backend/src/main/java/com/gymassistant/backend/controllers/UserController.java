package com.gymassistant.backend.controllers;

import com.gymassistant.backend.entities.User;
import com.gymassistant.backend.entities.UserInformation;
import com.gymassistant.backend.repositories.UserRepository;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name="User")
@RestController
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @PostMapping("/users/add")
    public User saveUser(@RequestBody UserInformation newUser) {
        User user = new User();
        user.setUsername(newUser.getUsername());
        user.setBirthdate(newUser.getBirthdate());
        user.setWeight(newUser.getWeight());

        return userRepository.save(user);
    }

}
