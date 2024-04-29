package com.example.demo1.entity;

public class Students {
    private Integer stuid;
    private String stunum;
    private String stuname;
    private String stusex;
    private Integer stuage;
    private String stuclass;

    public Students() {
    }

    public Students(Integer stuid, String stunum, String stuname, String stusex, Integer stuage, String stuclass) {
        this.stuid = stuid;
        this.stunum = stunum;
        this.stuname = stuname;
        this.stusex = stusex;
        this.stuage = stuage;
        this.stuclass = stuclass;
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getStunum() {
        return stunum;
    }

    public void setStunum(String stunum) {
        this.stunum = stunum;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getStusex() {
        return stusex;
    }

    public void setStusex(String stusex) {
        this.stusex = stusex;
    }

    public Integer getStuage() {
        return stuage;
    }

    public void setStuage(Integer stuage) {
        this.stuage = stuage;
    }

    public String getStuclass() {
        return stuclass;
    }

    public void setStuclass(String stuclass) {
        this.stuclass = stuclass;
    }

    @Override
    public String toString() {
        return "Students{" +
                "stuid=" + stuid +
                ", stunum='" + stunum + '\'' +
                ", stuname='" + stuname + '\'' +
                ", stusex='" + stusex + '\'' +
                ", stuage=" + stuage +
                ", stuclass='" + stuclass + '\'' +
                '}';
    }
}
