package com.reactboot.controller;

import com.reactboot.model.user;
import com.reactboot.repository.UsersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/users")
@ComponentScan("com.reactboot.repository")
public class UserController {

    @Autowired
    UsersRepository userRepository;

    @GetMapping(value = "/all")
    public List<user> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }

}