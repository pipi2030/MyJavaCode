package com.neutech.service;

import com.neutech.entity.Student;
import com.neutech.entity.User;

import java.util.List;

public interface UserService {
    User getAllByUserName(String userName);
    void register(User user);
}
