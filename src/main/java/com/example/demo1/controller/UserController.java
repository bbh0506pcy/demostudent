package com.example.demo1.controller;

import com.example.demo1.entity.Admin;
import com.example.demo1.entity.User;
import com.example.demo1.result.ResponseCode;
import com.example.demo1.result.ResponseData;
import com.example.demo1.service.AdminService;
import com.example.demo1.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
@RequestMapping("user")
@CrossOrigin("*")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/login")
    public ResponseData login(@RequestBody User user){
        //调用登陆的功能接口
       User userinfo = userService.login(user);
        if(userinfo == null){
            return new ResponseData(ResponseCode.LOGINFAILED);
        }else{
            return new ResponseData(ResponseCode.SUCCESS,userinfo);
        }
    }

    @PutMapping
    public ResponseData update(@RequestBody User user){
        int i =  userService.uppaw(user);
        if(i > 0 ){
            return new ResponseData(ResponseCode.SUCCESS);
        }else{
            return new ResponseData(ResponseCode.SQLEXCEPTION);
        }
    }
}
