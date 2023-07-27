package com.trioelite.backend.controller;

import com.trioelite.backend.entity.User;
import com.trioelite.backend.repository.UserRepository;
import com.trioelite.backend.service.UserService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.rmi.ServerException;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    //This will allow you to use userRepository anywhere in your controller without having to repeatedly instantiate it.
    @Autowired
    UserRepository userRepository;

    //returns all the users in the system
    @GetMapping("/user")
    public List<User> index(){
        return userRepository.findAll();
    }

    // returns a user by specified ID
    @GetMapping(value = "/users/{id}")
    public User getUser(@PathVariable("id") String id){
        return null;
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public User createUser(User user) {
        return user;
    }

    @DeleteMapping("user/{id}")
    public boolean delete(@PathVariable String id){
        int userId = Integer.parseInt(id);
        return true;
    }

}

