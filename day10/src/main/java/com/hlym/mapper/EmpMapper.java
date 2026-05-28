package com.hlym.mapper;

import com.hlym.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {

    List<Emp> list(String name, Short gender, LocalDate begin,LocalDate end);

    void delete(List<Integer> ids);

    void insert(Emp emp);

    Emp select(Integer id);

    void update(Emp emp);

    Emp getByUsernameAndPassword(Emp emp);


    void deleteByDeptId(Integer id);
}