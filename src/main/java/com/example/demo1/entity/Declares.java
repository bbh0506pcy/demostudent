package com.example.demo1.entity;

import java.io.Serializable;
public class Declares {
    private Integer declareid;
    private String projectname;
    private String declaretime;
    private Integer projectscore;
    private String declaerfile;
    private String stunum;


    public Declares() {
        // Default constructor
    }
    public Declares(Integer declareid, String projectname, String declaretime, Integer projectscore, String declaerfile, String stunum) {
        this.declareid = declareid;
        this.projectname = projectname;
        this.declaretime = declaretime;
        this.projectscore = projectscore;
        this.declaerfile = declaerfile;
        this.stunum = stunum;
    }

    public Integer getDeclareid() {
        return declareid;
    }

    public void setDeclareid(Integer declareid) {
        this.declareid = declareid;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getDeclaretime() {
        return declaretime;
    }

    public void setDeclaretime(String declaretime) {
        this.declaretime = declaretime;
    }

    public Integer getProjectscore() {
        return projectscore;
    }

    public void setProjectscore(Integer projectscore) {
        this.projectscore = projectscore;
    }

    public String getDeclaerfile() {
        return declaerfile;
    }

    public void setDeclaerfile(String declaerfile) {
        this.declaerfile = declaerfile;
    }

    public String getStunum() {
        return stunum;
    }

    public void setStunum(String stunum) {
        this.stunum = stunum;
    }

    @Override
    public String toString() {
        return "Declares{" +
                "declareid=" + declareid +
                ", projectname='" + projectname + '\'' +
                ", declaretime='" + declaretime + '\'' +
                ", projectscore=" + projectscore +
                ", declaerfile='" + declaerfile + '\'' +
                ", stunum='" + stunum + '\'' +
                '}';
    }
}
