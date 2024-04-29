package com.example.demo1.service;

import com.example.demo1.entity.Students;

import java.util.List;

public interface StudentService {
    List<Students> AllStudent();

    Long countFilms();

    int DelStudent(int stuid);

    int upStudent(Students students);

    int AddStudent(Students students);

    List<Students> searchStudent(String keyword);
}
