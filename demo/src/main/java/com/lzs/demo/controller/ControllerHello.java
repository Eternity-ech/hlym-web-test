package com.lzs.demo.controller;

import com.lzs.demo.pojo.Result;
import com.lzs.demo.pojo.Student;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
public class ControllerHello {

    @RequestMapping("/hello")
    public Result hello () {
        System.out.println("Hello Word");
        return Result.success("Hello Word");
    }//1

    @RequestMapping("/index")
    public Result index (String name, Integer age) {
        System.out.println(name + " " + age);
        return Result.success(name + " " + age);
    }//2

    @RequestMapping("/Student")
    public Result Student(Student student) {
        System.out.println(student);
        return Result.success(student);
    }//3

    @RequestMapping("/Date")
    public Result Date (@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime update) {
        System.out.println(update);
        return Result.success(update);
    }//4

    @RequestMapping("/Liste")
    public Result List (String[]list) {
        System.out.println(Arrays.toString(list));
        return Result.success(list);
    }//5

    @RequestMapping("/Arrays")
    public Result Arrays (@RequestParam List<String> list) {
        System.out.println(list);
        return Result.success(list);
    }//6

    @RequestMapping("/Pojo")
    public Result Pojo (@RequestBody Student student) {
        System.out.println(student);
        return Result.success(student);
    }//7

    @RequestMapping("/path/{id}")
    public Result pathParam (@PathVariable Integer id){
        System.out.println(id);
        return Result.success(id);
    }//8

    @RequestMapping("/path2/{id}/{name}")
    public Result pathParam2 (@PathVariable Integer id, @PathVariable String name){
        System.out.println(id+" "+name);
        return Result.success(id+" "+name);
    }//9
}
