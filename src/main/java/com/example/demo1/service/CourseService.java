package com.example.demo1.service;

import com.example.demo1.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> AllCourse();

    Long countFilms();

    int DelCourse(int courseid);

    int upCourse(Course course);

    int AddCourse(Course course);

    List<Course> searchCourse(String keyword);
}
