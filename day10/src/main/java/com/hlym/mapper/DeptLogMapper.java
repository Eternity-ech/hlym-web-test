package com.hlym.mapper;

import com.hlym.pojo.DeptLog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DeptLogMapper {

    void insert(DeptLog deptLog);
}
