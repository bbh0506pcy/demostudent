package com.example.demo1.controller;


import com.example.demo1.entity.Admin;
import com.example.demo1.entity.Course;
import com.example.demo1.entity.Students;
import com.example.demo1.result.ResponseCode;
import com.example.demo1.result.ResponseData;
import com.example.demo1.service.AdminService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("admin")
@CrossOrigin("*")
public class AdminController {

    @Resource
    private AdminService adminService;

    @PostMapping("/login")
    public ResponseData login(@RequestBody Admin admin){
        //调用登陆的功能接口
        Admin adminInfo = adminService.login(admin);
        if(adminInfo == null){
            return new ResponseData(ResponseCode.LOGINFAILED);
        }else{
            return new ResponseData(ResponseCode.SUCCESS,adminInfo);
        }
    }

    @PutMapping
    public ResponseData update(@RequestBody Admin admin){
        int i =  adminService.uppaw(admin);
        if(i > 0 ){
            return new ResponseData(ResponseCode.SUCCESS);
        }else{
            return new ResponseData(ResponseCode.SQLEXCEPTION);
        }
    }

}
