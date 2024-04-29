package com.example.demo1.controller;

import com.example.demo1.entity.Films;
import com.example.demo1.result.ResponseCode;
import com.example.demo1.result.ResponseData;
import com.example.demo1.service.FilmsService;
import com.example.demo1.util.UpUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("Films")
@CrossOrigin("*")
public class FilmController {
    @Resource
    private FilmsService filmsService;

    @GetMapping("/Film_list")
    public ResponseData AllFilm(){
        //调用service
        //List<Films> filmsList = filmsService.queryAll(page,limit);
        List<Films> filmsList = filmsService.AllFilm();
        Long count=filmsService.countFilms();
        return new ResponseData(ResponseCode.SUCCESS,filmsList,count);
    }

    @PutMapping
    public ResponseData update(@RequestBody Films film){
        int i =  filmsService.upFilm(film);
        if(i > 0 ){
            return new ResponseData(ResponseCode.SUCCESS);
        }else{
            return new ResponseData(ResponseCode.SQLEXCEPTION);
        }
    }

    @DeleteMapping("{id}")
    public ResponseData Delete(@PathVariable int id) {
        int i=filmsService.DelFilm(id);
        if(i>0){
            return new ResponseData(ResponseCode.SUCCESS,i);
        }else{
            return new ResponseData(ResponseCode.SQLEXCEPTION);
        }


    }

    @GetMapping("/search")
    public ResponseData searchFilms(String keyword) {
        // 调用 Service 方法进行搜索
        List<Films> filmsList = filmsService.searchFilms(keyword);
        return new ResponseData(ResponseCode.SUCCESS,filmsList);
        //return filmsService.searchFilms(keyword);

    }


    @PostMapping("/addfilms")
    public ResponseData Insert(@RequestBody Films film) {
        int i=filmsService.AddFilm(film);
        if(i>0){
            return new ResponseData(ResponseCode.SUCCESS,i);
        }else{
            return new ResponseData(ResponseCode.SQLEXCEPTION);
        }


    }

    @PostMapping("/up_img")
    public ResponseData upImg(@RequestPart("file") MultipartFile file) throws IOException {
        String url = UpUtils.upFile(file, "img");
        if(url == null){
            return new ResponseData(ResponseCode.FAILED);
        }
        return new ResponseData(ResponseCode.SUCCESS,url);
    }


}
