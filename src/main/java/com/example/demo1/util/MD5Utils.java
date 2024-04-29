package com.example.demo1.util;

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * 加密算法
 */
public class MD5Utils {

    public static String encryption(String source, String salt){
        //第一个参数: 加密的对象   第二个参数: 盐  第三个参数: 加密的次数
        Md5Hash md5Hash = new Md5Hash(source,salt,1000);
        return  md5Hash.toString();
    }

    // 针对用户的密码加密   加密对象是password  加密的盐是 username
    public static void main(String[] args) {
        String res = MD5Utils.encryption("9999", "abc");
        System.out.println(res);
    }


}