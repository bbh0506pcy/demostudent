package com.example.demo1.service.impl;

import com.example.demo1.entity.Types;
import com.example.demo1.mapper.FilmsMapper;
import com.example.demo1.mapper.TypesMapper;
import com.example.demo1.service.TypesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service()
public class TypesServiceImpl implements TypesService {

    @Resource
    private TypesMapper typesMapper;
    @Override
    public List<Types> AllType() {
        return typesMapper.AllType();
    }

    @Override
    public Long countFilms() {
        return typesMapper.count();
    }

    @Override
    public int upTypes(Types types) {
        return typesMapper.upTypes(types);
    }

    @Override
    public int DelTypes(int id) {
        return typesMapper.DelTypes(id);
    }

    @Override
    public List<Types> searchTypes(String keyword) {
        return typesMapper.searchTypes(keyword);
    }

    @Override
    public int AddTypes(Types types) {
        return typesMapper.AddTypes(types);
    }
}
