package com.hlym.service;

import com.hlym.pojo.Emp;
import com.hlym.pojo.PageBean;

import java.time.LocalDate;
import java.util.List;

public interface EmpService {

    PageBean page(String name, Short gender, LocalDate begin,LocalDate end, Integer page, Integer pageSize);

    void delete(List<Integer> ids);

    void insert(Emp emp);

    Emp select(Integer id);

    void update(Emp emp);

    Emp login(Emp emp);
}
