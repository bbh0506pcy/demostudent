package com.example.demo1.service.impl;

import com.example.demo1.entity.Films;
import com.example.demo1.mapper.FilmsMapper;
import com.example.demo1.service.FilmsService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service()
public class FilmsServiceImpl implements FilmsService {
    @Resource
    private FilmsMapper filmsMapper;
    @Override
    public List<Films> queryAll(Integer page,Integer limit) {
        //
        page=(page-1)*limit;
        List<Films> filmsList =  filmsMapper.queryAll(page,limit);
        // 对数据进行处理
        return filmsList;
    }

    @Override
    public Long countFilms() {
        return filmsMapper.count();
    }

    @Override
    public List<Films> AllFilm() {
        return filmsMapper.AllFilm();
    }

    @Override
    public List<Films> selectfilmByISDN(int id) {
        return filmsMapper.selectfilmByISDN(id);
    }
    @Override
    public List<Films> selectfilmByDir(String director) {
        return filmsMapper.selectfilmByDir(director);
    }
    @Override
    public List<Films> selectfilmBytype(String type) {
        return filmsMapper.selectfilmBytype(type);
    }
    @Override
    public int AddFilm(Films film) {
        return filmsMapper.AddFilm(film);
    }
    @Override
    public int upFilm(Films film) {
        return filmsMapper.upFilm(film);
    }
    @Override
    public int DelFilm(int id) {
        return filmsMapper.DelFilm(id);
    }

    @Override
    public List<Films> searchFilms(String keyword) {
        // 调用 MyBatis Mapper 方法查询数据库
        return filmsMapper.searchFilms(keyword);
    }

}

