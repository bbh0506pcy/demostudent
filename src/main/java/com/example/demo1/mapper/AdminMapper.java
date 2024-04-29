package com.example.demo1.mapper;

import com.example.demo1.entity.Admin;
import org.apache.ibatis.annotations.Param;

public interface AdminMapper {
    Admin queryNumPass(@Param("adminnum") String adminnum,@Param("adminpaw") String adminpaw);
    Admin findByAdminnumAndPassword(@Param("adminnum") String adminnum, @Param("adminpaw") String adminpaw);



    int uppaw(Admin admin);
}
