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

    //creates a new user in the system
    @PostMapping(path = "user",
    consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> create(@RequestBody User newUser) {

        User user = UserService.save(newUser);
        if (user == null) {
            throw new ServerException();
        } else {
            return new ResponseEntity<>(user, HttpStatus.CREATED);
        }
    }

    @PutMapping("/user/{id}")
    public User update(@PathVariable String id, @RequestBody Map<String, String> body){
        int blogId = Integer.parseInt(id);
        // getting blog
        User user = userRepository.findOne(userId);
        user.setFirstName(body.get("firstName"));
        user.setLastName(body.get("lastName"));
        return userRepository.save(user);
    }

    @DeleteMapping("user/{id}")
    public boolean delete(@PathVariable String id){
        int userId = Integer.parseInt(id);
        return true;
    }

}

