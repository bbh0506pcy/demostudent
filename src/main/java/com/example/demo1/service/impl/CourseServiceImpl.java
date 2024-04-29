package com.example.demo1.service.impl;

import com.example.demo1.entity.Course;
import com.example.demo1.mapper.CourseMapper;
import com.example.demo1.mapper.DeclaresMapper;
import com.example.demo1.service.CourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service()
public class CourseServiceImpl implements CourseService {
    @Resource
    private CourseMapper courseMapper;

    @Override
    public List<Course> AllCourse() {
        return courseMapper.AllCourse();
    }

    @Override
    public Long countFilms() {
        return courseMapper.count();
    }

    @Override
    public int DelCourse(int courseid) {
        return courseMapper.DelCourse(courseid);
    }

    @Override
    public int upCourse(Course course) {
        return courseMapper.upCourse(course);
    }

    @Override
    public int AddCourse(Course course) {
        return courseMapper.AddCourse(course);
    }

    @Override
    public List<Course> searchCourse(String keyword) {
        return courseMapper.searchCourse(keyword);
    }
}
