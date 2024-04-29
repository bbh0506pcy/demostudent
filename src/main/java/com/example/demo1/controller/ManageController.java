package com.example.demo1.controller;

import com.example.demo1.entity.*;
import com.example.demo1.result.ResponseCode;
import com.example.demo1.result.ResponseData;
import com.example.demo1.service.DeclaresService;
import com.example.demo1.service.ScoreService;
import com.example.demo1.service.StudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("Manage")
@CrossOrigin("*")
public class ManageController {
    @Resource
    private StudentService studentService;



    @GetMapping("/stumessagelist")
    public ResponseData AllStudent(){
        //调用service
        //List<Films> filmsList = filmsService.queryAll(page,limit);
        List<Students> studentsList = studentService.AllStudent();
        Long count=studentService.countFilms();
        return new ResponseData(ResponseCode.SUCCESS,studentsList,count);
    }

    @DeleteMapping("{stuid}")
    public ResponseData Delete(@PathVariable int stuid) {
        int i=studentService.DelStudent(stuid);
        if(i>0){
            return new ResponseData(ResponseCode.SUCCESS,i);
        }else{
            return new ResponseData(ResponseCode.SQLEXCEPTION);
        }


    }

    @PutMapping
    public ResponseData update(@RequestBody Students students){
        int i =  studentService.upStudent(students);
        if(i > 0 ){
            return new ResponseData(ResponseCode.SUCCESS);
        }else{
            return new ResponseData(ResponseCode.SQLEXCEPTION);
        }
    }

    @PostMapping("/addstudent")
    public ResponseData Insert(@RequestBody Students students) {
        int i=studentService.AddStudent(students);
        if(i>0){
            return new ResponseData(ResponseCode.SUCCESS,i);
        }else{
            return new ResponseData(ResponseCode.SQLEXCEPTION);
        }


    }

    @GetMapping("/search")
    public ResponseData searchTypes(String keyword) {
        // 调用 Service 方法进行搜索
        List<Students> studentsList = studentService.searchStudent(keyword);
        return new ResponseData(ResponseCode.SUCCESS, studentsList);
        //return filmsService.searchFilms(keyword);

    }


}
