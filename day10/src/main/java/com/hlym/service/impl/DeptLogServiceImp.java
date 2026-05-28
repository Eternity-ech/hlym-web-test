package com.hlym.service.impl;

import com.hlym.mapper.DeptLogMapper;
import com.hlym.pojo.DeptLog;
import com.hlym.service.DeptLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class DeptLogServiceImp implements DeptLogService {

    @Autowired
    private DeptLogMapper deptLogMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void insert(DeptLog deptLog) {
        deptLogMapper.insert(deptLog);
    }
}
