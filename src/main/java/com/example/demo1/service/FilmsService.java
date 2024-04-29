package com.example.demo1.service;
import com.example.demo1.entity.Films;

import java.util.List;

public interface FilmsService {
    List<Films> queryAll(Integer page,Integer limit);
    Long countFilms();
    List<Films> AllFilm();

    /**
     * 通过ISDN查电影
     * @param id
     * @return
     */
     List<Films> selectfilmByISDN(int id);

    /**
     * 通过导演查电影
     * @param director
     * @return
     */
     List<Films> selectfilmByDir(String director);

    /**
     *  通过类型查电影
     * @param type
     * @return
     */
     List<Films> selectfilmBytype(String type);

    /**
     * 添加电影
     * @param film
     * @return
     */
     int AddFilm(Films film);

    /**
     * 修改电影
     * @param film
     * @return
     */
     int upFilm(Films film);

    /**
     * 通过ISDN 删除电影
     * @param id
     * @return
     */
    int DelFilm(int id);

    List<Films> searchFilms(String keyword);
}
