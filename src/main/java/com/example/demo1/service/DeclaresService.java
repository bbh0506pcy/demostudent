package com.example.demo1.service;

import com.example.demo1.entity.Declares;

import java.util.List;

public interface DeclaresService {
    List<Declares> AllDeclare();

    Long countFilms();


    int AddDeclare(Declares declares);

    int DelDeclare(int declareid);
}
