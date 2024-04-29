package com.example.demo1.mapper;

import com.example.demo1.entity.Course;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseMapper {
    List<Course> AllCourse();

    Long count();

    int DelCourse(int courseid);

    int upCourse(Course course);

    int AddCourse(Course course);

    List<Course> searchCourse(@Param("keyword")String keyword);
}
