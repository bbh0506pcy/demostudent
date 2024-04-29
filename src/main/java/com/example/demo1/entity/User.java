package com.example.demo1.entity;

public class User {
    private Integer userid;
    private String usernum;
    private String userpaw;

    public User() {

    }

    public User(Integer userid, String usernum, String userpaw) {
        this.userid = userid;
        this.usernum = usernum;
        this.userpaw = userpaw;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsernum() {
        return usernum;
    }

    public void setUsernum(String usernum) {
        this.usernum = usernum;
    }

    public String getUserpaw() {
        return userpaw;
    }

    public void setUserpaw(String userpaw) {
        this.userpaw = userpaw;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", usernum='" + usernum + '\'' +
                ", userpaw='" + userpaw + '\'' +
                '}';
    }
}
