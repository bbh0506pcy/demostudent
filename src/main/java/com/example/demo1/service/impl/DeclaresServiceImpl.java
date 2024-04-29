package com.example.demo1.service.impl;

import com.example.demo1.entity.Declares;
import com.example.demo1.mapper.DeclaresMapper;
import com.example.demo1.service.DeclaresService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service()
public class DeclaresServiceImpl implements DeclaresService {
    @Resource
    private DeclaresMapper declaresMapper;
    @Override
    public List<Declares> AllDeclare() {
        return declaresMapper.AllDeclare();
    }

    @Override
    public Long countFilms() {
        return declaresMapper.count();
    }

    @Override
    public int AddDeclare(Declares declares) {
        return declaresMapper.AddDeclare(declares);
    }

    @Override
    public int DelDeclare(int declareid) {
        return declaresMapper.DelDeclare(declareid);
    }
}
