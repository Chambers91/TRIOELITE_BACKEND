package com.trioelite.Backend.Users;

import lombok.Getter;

import java.time.LocalDate;
import java.util.Date;

@Getter
public class User {

    private Long id;
    //getters and setters
    @Getter
    private String email;
    @Getter
    private String password;
//    private String firstName;
//    private String lastName;
//    private Date dob;
//

//constructor
    public User(Long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //toStrings

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
