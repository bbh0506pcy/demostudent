package com.example.demo1.service;

import com.example.demo1.entity.Types;

import java.util.List;

public interface TypesService {
    List<Types> AllType();
    Long countFilms();
    int upTypes(Types types);

    int DelTypes(int id);

    List<Types> searchTypes(String keyword);

    int AddTypes(Types types);
}
