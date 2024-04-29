package com.example.demo1.controller;

import com.example.demo1.entity.Declares;
import com.example.demo1.entity.Films;
import com.example.demo1.entity.Score;
import com.example.demo1.entity.Types;
import com.example.demo1.result.ResponseCode;
import com.example.demo1.result.ResponseData;
import com.example.demo1.service.DeclaresService;
import com.example.demo1.service.FilmsService;
import com.example.demo1.service.ScoreService;
import com.example.demo1.util.UpUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;


@RestController
@RequestMapping("Students")
@CrossOrigin("*")
public class StudentsController {

    @Resource
    private DeclaresService declaresService;
    @Resource
    private ScoreService scoreService;


    @GetMapping("/declare_list")
    public ResponseData AllDeclare(){
        //调用service
        //List<Films> filmsList = filmsService.queryAll(page,limit);
        List<Declares> declaresList = declaresService.AllDeclare();
        Long count=declaresService.countFilms();
        return new ResponseData(ResponseCode.SUCCESS,declaresList,count);
    }
    @GetMapping("/course_score")
    public ResponseData AllScore(){
        //调用service
        //List<Films> filmsList = filmsService.queryAll(page,limit);
        List<Score> scoresList = scoreService.AllScore();
        Long count=declaresService.countFilms();
        return new ResponseData(ResponseCode.SUCCESS,scoresList,count);
    }
    @PostMapping("/adddeclare")
    public ResponseData Insert(@RequestBody Declares declares) {
        int i=declaresService.AddDeclare(declares);
        if(i>0){
            return new ResponseData(ResponseCode.SUCCESS,i);
        }else{
            return new ResponseData(ResponseCode.SQLEXCEPTION);
        }


    }

    @DeleteMapping("{declareid}")
    public ResponseData Delete(@PathVariable int declareid) {
        int i=declaresService.DelDeclare(declareid);
        if(i>0){
            return new ResponseData(ResponseCode.SUCCESS,i);
        }else{
            return new ResponseData(ResponseCode.SQLEXCEPTION);
        }


    }

}
