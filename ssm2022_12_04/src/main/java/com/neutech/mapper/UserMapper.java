package com.neutech.mapper;

import com.neutech.entity.User;

public interface UserMapper {
    User getAllByUserName(String userName);
    void register(User user);
}
