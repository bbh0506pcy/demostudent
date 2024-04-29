package com.example.demo1.service.impl;

import com.example.demo1.entity.Students;
import com.example.demo1.mapper.StudentMapper;
import com.example.demo1.mapper.TypesMapper;
import com.example.demo1.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service()
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Students> AllStudent() {
        return studentMapper.AllStudent() ;
    }

    @Override
    public Long countFilms() {
       return studentMapper.count();
    }

    @Override
    public int DelStudent(int stuid) {
        return studentMapper.DelStudent(stuid);
    }

    @Override
    public int upStudent(Students students) {
        return studentMapper.upStudent(students);
    }

    @Override
    public int AddStudent(Students students) {
        return studentMapper.AddStudent(students);
    }

    @Override
    public List<Students> searchStudent(String keyword) {
        return studentMapper.searchStudent(keyword);
    }
}
