package com.example.demo1.entity;

public class Score {
    private Integer scoreid;
    private String stunum;
    private String coursename;
    private Integer score;
    private String department;

    public Score() {
    }

    public Score(Integer scoreid, String stunum, String coursename, Integer score, String department) {
        this.scoreid = scoreid;
        this.stunum = stunum;
        this.coursename = coursename;
        this.score = score;
        this.department = department;
    }

    public Integer getScoreid() {
        return scoreid;
    }

    public void setScoreid(Integer scoreid) {
        this.scoreid = scoreid;
    }

    public String getStunum() {
        return stunum;
    }

    public void setStunum(String stunum) {
        this.stunum = stunum;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Score{" +
                "scoreid=" + scoreid +
                ", stunum='" + stunum + '\'' +
                ", coursename='" + coursename + '\'' +
                ", score=" + score +
                ", department='" + department + '\'' +
                '}';
    }
}
