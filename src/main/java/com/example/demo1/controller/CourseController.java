package com.example.demo1.controller;

import com.example.demo1.entity.Course;
import com.example.demo1.entity.Students;
import com.example.demo1.entity.Types;
import com.example.demo1.result.ResponseCode;
import com.example.demo1.result.ResponseData;
import com.example.demo1.service.CourseService;
import com.example.demo1.service.StudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("Course")
@CrossOrigin("*")
public class CourseController {

    @Resource
    private CourseService courseService;



    @GetMapping("/courselist")
    public ResponseData AllCourse(){
        //调用service
        //List<Films> filmsList = filmsService.queryAll(page,limit);
        List<Course> studentsList = courseService.AllCourse();
        Long count=courseService.countFilms();
        return new ResponseData(ResponseCode.SUCCESS,studentsList,count);
    }


    @DeleteMapping("{courseid}")
    public ResponseData Delete(@PathVariable int courseid) {
        int i=courseService.DelCourse(courseid);
        if(i>0){
            return new ResponseData(ResponseCode.SUCCESS,i);
        }else{
            return new ResponseData(ResponseCode.SQLEXCEPTION);
        }
    }

    @PutMapping
    public ResponseData update(@RequestBody Course course){
        int i =  courseService.upCourse(course);
        if(i > 0 ){
            return new ResponseData(ResponseCode.SUCCESS);
        }else{
            return new ResponseData(ResponseCode.SQLEXCEPTION);
        }
    }

    @PostMapping("/addcourse")
    public ResponseData Insert(@RequestBody Course course) {
        int i=courseService.AddCourse(course);
        if(i>0){
            return new ResponseData(ResponseCode.SUCCESS,i);
        }else{
            return new ResponseData(ResponseCode.SQLEXCEPTION);
        }


    }

    @GetMapping("/search")
    public ResponseData searchTypes(String keyword) {
        // 调用 Service 方法进行搜索
        List<Course> courseList = courseService.searchCourse(keyword);
        return new ResponseData(ResponseCode.SUCCESS, courseList);
        //return filmsService.searchFilms(keyword);

    }

}
