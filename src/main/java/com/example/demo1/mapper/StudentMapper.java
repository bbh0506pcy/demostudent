package com.example.demo1.mapper;

import com.example.demo1.entity.Students;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    List<Students> AllStudent();

    Long count();

    int DelStudent(int stuid);

    int upStudent(Students students);

    int AddStudent(Students students);


    List<Students> searchStudent(@Param("keyword")String keyword);
}
