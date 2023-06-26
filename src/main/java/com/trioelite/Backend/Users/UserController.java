package com.trioelite.Backend.Users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/users")
public class UserController {

    @GetMapping()
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


