package com.example.demo1.controller;

import com.example.demo1.entity.Types;
import com.example.demo1.result.ResponseCode;
import com.example.demo1.result.ResponseData;
import com.example.demo1.service.TypesService;
import org.assertj.core.internal.bytebuddy.description.type.TypeList;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("Types")
@CrossOrigin("*")
public class TypeController {

    @Resource
    private TypesService typesService;

    @GetMapping("/Type_list")
    public ResponseData AllType(){
        //调用service
        //List<Films> filmsList = filmsService.queryAll(page,limit);
        List<Types> typesList = typesService.AllType();
        Long count=typesService.countFilms();
        return new ResponseData(ResponseCode.SUCCESS,typesList,count);
    }

    @PutMapping
    public ResponseData update(@RequestBody Types types){
        int i =  typesService.upTypes(types);
        if(i > 0 ){
            return new ResponseData(ResponseCode.SUCCESS);
        }else{
            return new ResponseData(ResponseCode.SQLEXCEPTION);
        }
    }

    @DeleteMapping("{id}")
    public ResponseData Delete(@PathVariable int id) {
        int i=typesService.DelTypes(id);
        if(i>0){
            return new ResponseData(ResponseCode.SUCCESS,i);
        }else{
            return new ResponseData(ResponseCode.SQLEXCEPTION);
        }


    }

    @GetMapping("/search")
    public ResponseData searchTypes(String keyword) {
        // 调用 Service 方法进行搜索
        List<Types> typesList = typesService.searchTypes(keyword);
        return new ResponseData(ResponseCode.SUCCESS, typesList);
        //return filmsService.searchFilms(keyword);

    }


    @PostMapping("/addtypes")
    public ResponseData Insert(@RequestBody Types types) {
        int i=typesService.AddTypes(types);
        if(i>0){
            return new ResponseData(ResponseCode.SUCCESS,i);
        }else{
            return new ResponseData(ResponseCode.SQLEXCEPTION);
        }


    }




}
