package com.example.demo1.mapper;

import com.example.demo1.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User queryNumPass(@Param("usernum") String usernum,@Param("userpaw") String userpaw);

    int uppaw(User user);
}
