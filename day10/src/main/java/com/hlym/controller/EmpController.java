package com.hlym.controller;

import com.hlym.pojo.Emp;
import com.hlym.pojo.PageBean;
import com.hlym.pojo.Result;
import com.hlym.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("emps")
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping
    public Result list(String name, Short gender,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer pageSize) {
        log.info("分页查询员工,参数:{},{},{},{},{},{}", name, gender, begin, end, page, pageSize);
        PageBean pageBean = empService.page(name, gender, begin, end, page,pageSize);
        return Result.success(pageBean);
    }

    @DeleteMapping("/{ids}")
    public Result delete(@PathVariable("ids") List<Integer> ids) {
        log.info("删除员工,参数:{}",ids);
        empService.delete(ids);
        return Result.success();
    }

    @PostMapping
    public Result add(@RequestBody Emp emp) {
        log.info("新增员工,参数:{}",emp);
        empService.insert(emp);
        return Result.success(emp);
    }

    @GetMapping("/{id}")
    public Result get(@PathVariable("id") Integer id) {
        log.info("查询的员工id:{}",id);
        Emp emp = empService.select(id);
        return Result.success(emp);
    }

    @PutMapping
    public Result update(@RequestBody Emp emp) {
        log.info("修改的为emp:{}",emp);
        empService.update(emp);
        return Result.success(emp);
    }
}