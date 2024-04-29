package com.example.demo1.entity;

public class Admin {
    private Integer adminid;
    private String adminnum;
    private String adminpaw;

    public Admin() {

    }

    public Admin(Integer adminid, String adminnum, String adminpaw) {
        this.adminid = adminid;
        this.adminnum = adminnum;
        this.adminpaw = adminpaw;
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public String getAdminnum() {
        return adminnum;
    }

    public void setAdminnum(String adminnum) {
        this.adminnum = adminnum;
    }

    public String getAdminpaw() {
        return adminpaw;
    }

    public void setAdminpaw(String adminpaw) {
        this.adminpaw = adminpaw;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminid=" + adminid +
                ", adminnum='" + adminnum + '\'' +
                ", adminpaw='" + adminpaw + '\'' +
                '}';
    }
}
