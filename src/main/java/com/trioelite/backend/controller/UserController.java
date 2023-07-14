package com.trioelite.backend.controller;

import com.trioelite.backend.entity.User;
import com.trioelite.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    //This will allow you to use userRepository anywhere in your controller without having to repeatedly instantiate it.
    @Autowired
    UserRepository userRepository;

    @GetMapping("/user")
    public List<User> index(){
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    public User show(@PathVariable String id){
        int userId = Integer.parseInt(id);
        return userRepository.findOne(userId);
    }

    @PostMapping("/user/search")
    public List<User> search(@RequestBody Map<String, String> body){
        String searchTerm = body.get("text");
        return userRepository.findByTitleContainingOrContentContaining(searchTerm, searchTerm);
    }

    @PostMapping("/user")
    public User create(@RequestBody Map<String, String> body){
        String title = body.get("title");
        String content = body.get("content");
        return userRepository.save(new User());
    }

    @PutMapping("/blog/{id}")
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
        userRepository.delete(userId);
        return true;
    }

}

