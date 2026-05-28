package com.hlym.mapper;

import com.hlym.pojo.Emp;
import org.apache.ibatis.annotations.*;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


@Mapper
public interface UserMapper {
    //@Delete("delete from emp where id=#{id}")
    public int deleteEmp(List<Integer> list);

    //@Options(useGeneratedKeys = true , keyProperty = "id" )
    //@Insert("insert into emp (username, password, name, gender, image, job, entrydate, dept_id, create_time, update_time)" +
    //        "values (#{username},#{password},#{name},#{gender},#{image},#{job},#{entrydate},#{deptId},#{createTime},#{updateTime})")
    public void insterEmp(Emp emp);

    //@Update("update emp set username = #{username}, name = #{name} where id = #{id}")
    public void updateEmp(Emp emp);

    //@Select("select * from emp where id = #{id}")
    public Emp selectEmp(Integer id);

    //@Select("select * from emp where name like concat('%',#{name},'%')")
    public List<Emp> selectEmp2(String name, Short gender, Short job, Integer deptId, LocalDateTime begin, LocalDateTime end);
}