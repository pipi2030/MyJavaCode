package com.neutech.repository;

import com.neutech.entity.UserJpa;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;
    @Test
    public void findAllTest(){
        List<UserJpa> all = userRepository.findAll();
        for (UserJpa userJpa : all) {
            System.err.println(userJpa);
        }
    }
    @Test
    public void findByIdTest(){
        Optional<UserJpa> byId = userRepository.findById(13);
        if(byId.isPresent()){
            System.err.println(byId.get());
        }
    }
    @Test
    public void findByUsernameTest(){
        UserJpa root = userRepository.findByUsername("root");
        System.out.println(root);
    }

}
