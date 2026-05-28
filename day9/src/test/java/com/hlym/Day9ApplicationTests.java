package com.hlym;

import com.hlym.mapper.UserMapper;
import com.hlym.pojo.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@SpringBootTest
class Day9ApplicationTests {

	@Autowired
	private UserMapper userMapper;
	@Test
	void delectEmp() {
		List<Integer> list = Arrays.asList(18,20,23);
		userMapper.deleteEmp(list);
	}

	@Autowired
	private UserMapper userMapper2;
	@Test
	void insertEmp() {
		Emp emp = new Emp();
		emp.setUsername("xiaoming3");
		emp.setPassword("1234");
		emp.setName("小明3");
		emp.setGender((short)1);
		emp.setImage("1.jpg");
		emp.setJob((short)1);
		emp.setEntrydate(LocalDate.of(2000,1,1));
		emp.setDeptId(1);
		emp.setCreateTime(LocalDateTime.now());
		emp.setUpdateTime(LocalDateTime.now());

		userMapper2.insterEmp(emp);
		System.out.println(emp.getId());
	}

	@Autowired
	private UserMapper userMapper3;
	@Test
	void updateEmp() {
		Emp emp = new Emp();
		emp.setId(18);
		emp.setUsername("xiaoming1");
		emp.setName("小明1");
		userMapper3.updateEmp(emp);
	}

	@Autowired
	private UserMapper userMapper4;
	@Test
	void selectEmp() {
		Emp emp = userMapper4.selectEmp(18);
		System.out.println(emp);
	}

	@Autowired
	private UserMapper userMapper5;
	@Test
	void selectEmp2() {
		LocalDateTime begin = LocalDate.of(2000, 1, 1).atStartOfDay();
		LocalDateTime end = LocalDate.of(2000, 1, 3).atStartOfDay();
		List<Emp> list = userMapper4.selectEmp2("小", null, null, null, begin, end);
		System.out.println(list);
	}
}