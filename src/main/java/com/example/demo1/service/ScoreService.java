package com.example.demo1.service;

import com.example.demo1.entity.Score;

import java.util.List;

public interface ScoreService {
    List<Score> AllScore();
    Long countFilms();
}
