package com.example.demo1.service.impl;

import com.example.demo1.entity.Score;
import com.example.demo1.mapper.ScoreMapper;
import com.example.demo1.mapper.TypesMapper;
import com.example.demo1.service.ScoreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service()
public class ScoreServiceImpl implements ScoreService {

    @Resource
    private ScoreMapper scoreMapper;
    @Override
    public List<Score> AllScore() {
        return scoreMapper.AllScore();
    }

    @Override
    public Long countFilms() {
        return scoreMapper.count();
    }

}
