package com.neutech.mapper;

import com.neutech.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import java.util.List;

public interface UserMapper {
    List<User> listUser();
    User getUserByName(String username);
    int insert(@Param("username")String username,
               @Param("password")String password,
               @Param("role")int role);
}
