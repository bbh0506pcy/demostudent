package com.example.demo1.entity;

public class Course {
    private Integer courseid;
    private Integer coursehours;
    private String coursename;
    private String courseteacher;
    private Integer columnscore;

    public Course() {
    }

    public Course(Integer courseid, Integer coursehours, String coursename, String courseteacher, Integer columnscore) {
        this.courseid = courseid;
        this.coursehours = coursehours;
        this.coursename = coursename;
        this.courseteacher = courseteacher;
        this.columnscore = columnscore;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public Integer getCoursehours() {
        return coursehours;
    }

    public void setCoursehours(Integer coursehours) {
        this.coursehours = coursehours;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getCourseteacher() {
        return courseteacher;
    }

    public void setCourseteacher(String courseteacher) {
        this.courseteacher = courseteacher;
    }

    public Integer getColumnscore() {
        return columnscore;
    }

    public void setColumnscore(Integer columnscore) {
        this.columnscore = columnscore;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseid=" + courseid +
                ", coursehours=" + coursehours +
                ", coursename='" + coursename + '\'' +
                ", courseteacher='" + courseteacher + '\'' +
                ", columnscore=" + columnscore +
                '}';
    }
}
