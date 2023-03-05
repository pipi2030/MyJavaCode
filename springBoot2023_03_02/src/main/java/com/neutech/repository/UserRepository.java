package com.neutech.repository;

import com.neutech.entity.UserJpa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserJpa,Integer> {
    UserJpa findByUsername(String username);
}
