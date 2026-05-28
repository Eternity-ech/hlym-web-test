package com.hlym.mapper;

import com.hlym.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {
    List<Dept> list();

    void delete(Integer id);

    void add(Dept dept);
}
