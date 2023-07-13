package com.trioelite.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @NonNull
    @Column(name = "FirstName")
    String firstName;
    @NonNull
    @Column(name = "LastName")
    String lastName;
    @NonNull
    @Column(name = "email")
    String email;
    @NonNull
    @Column(name = "password")
    String password;


}
