package com.trioelite.backend.controller;

import com.trioelite.backend.user.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping(method = RequestMethod.GET, path = "/users")
public class UserController {

    @GetMapping("/")
    public List<User> getUsers(){
    return List.of(
        new User(
                1L,
                 "Terence@aol.com",
            "test123"
        )
        );


    }
}


