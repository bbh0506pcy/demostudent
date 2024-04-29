package com.example.demo1.mapper;

import com.example.demo1.entity.Films;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FilmsMapper {

    List<Films> queryAll(@Param("page")Integer page,@Param("limit")Integer limit);

    Long count();
    /**
     *   查找全部电影
     * @return
     */
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

    List<Films> searchFilms(@Param("keyword") String keyword);
}
