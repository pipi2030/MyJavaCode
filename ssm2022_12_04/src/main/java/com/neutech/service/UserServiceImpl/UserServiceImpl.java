package com.neutech.service.UserServiceImpl;

import com.neutech.entity.User;
import com.neutech.mapper.UserMapper;
import com.neutech.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getAllByUserName(String userName) {
        return userMapper.getAllByUserName(userName);
    }

    @Override
    public void register(User user) {
        userMapper.register(user);
    }
}
