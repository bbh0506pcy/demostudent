package com.example.demo1.service.impl;

import com.example.demo1.entity.Admin;
import com.example.demo1.mapper.AdminMapper;
import com.example.demo1.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service()
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminMapper adminMapper;

    @Override
    public Admin login(Admin admin) {
        //编写登陆业务
        //将用户名和密码拿到数据库中去对比(通过用户名和密码去查询用户)
        // select * from users where username="" and password= ""
        Admin admin1 = adminMapper.queryNumPass(admin.getAdminnum(),admin.getAdminpaw());
        //如果对比成功,返回Users对象
        //如果对比失败,返回NUll
        if(admin1 != null){
            admin1.setAdminpaw("");
        }
        return admin1;
    }

    @Override
    public int upAdmin(Admin admin) {
        return 0;
    }

    @Override
    public int uppaw(Admin admin) {

            return adminMapper.uppaw(admin);


    }


}
