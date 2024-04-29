package com.example.demo1.service.impl;

import com.example.demo1.entity.Admin;
import com.example.demo1.entity.User;
import com.example.demo1.mapper.AdminMapper;
import com.example.demo1.mapper.UserMapper;
import com.example.demo1.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;
    @Override
    public User login(User user) {
        //编写登陆业务
        //将用户名和密码拿到数据库中去对比(通过用户名和密码去查询用户)
        // select * from users where username="" and password= ""
        User user1 = userMapper.queryNumPass(user.getUsernum(),user.getUserpaw());
        //如果对比成功,返回Users对象
        //如果对比失败,返回NUll
        if(user1 != null){
            user1.setUserpaw("");
        }
        return user1;
    }

    @Override
    public int uppaw(User user) {
        return userMapper.uppaw(user);

    }
}
