package com.trioelite.backend.repository;

import com.trioelite.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, String> {


}
