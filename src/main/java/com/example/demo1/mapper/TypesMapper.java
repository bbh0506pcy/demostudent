package com.example.demo1.mapper;

import com.example.demo1.entity.Types;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TypesMapper {
    List<Types> AllType();


    Long count();

    int upTypes(Types types);

    int DelTypes(int id);

    List<Types> searchTypes(@Param("keyword") String keyword);

    int AddTypes(Types types);
}
