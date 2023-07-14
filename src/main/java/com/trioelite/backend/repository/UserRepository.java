package com.trioelite.backend.repository;

import com.trioelite.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {


    // custom query to search to blog post by title or content
    List<User> findByTitleContainingOrContentContaining(Integer Id,String firstName, String lastName, String email, String password);
}
