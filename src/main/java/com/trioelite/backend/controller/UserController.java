package com.trioelite.backend.controller;

import com.trioelite.backend.entity.User;
import com.trioelite.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserController {

    //This will allow you to use userRepository anywhere in your controller without having to repeatedly instantiate it.
    @Autowired
    UserRepository userRepository;

    //returns all the users in the system
    @GetMapping("/getUser")
    public List<User> index(){
        return userRepository.findAll();
    }

    // returns a user by specified ID
    @GetMapping(value = "/users/{id}")
    public User getUser(@PathVariable("id") String id){
        return null;
    }

    @PostMapping("/addUser")

    @PutMapping("/updateUser")

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public User createUser(User user) {
        return user;
    }

    @DeleteMapping("deleteUser/{id}")
    public boolean delete(@PathVariable String id){
        int userId = Integer.parseInt(id);
        return true;
    }



}

