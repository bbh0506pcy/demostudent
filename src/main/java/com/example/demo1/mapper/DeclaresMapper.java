package com.example.demo1.mapper;

import com.example.demo1.entity.Declares;

import java.util.List;

public interface DeclaresMapper {
    List<Declares> AllDeclare();


    Long count();
    int AddDeclare(Declares declares);

    int DelDeclare(int declareid);
}
