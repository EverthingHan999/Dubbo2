package com.je1809.impl;

import com.je1809.mapper.EmpMapper;
import com.je1809.pojo.Emp;
import com.je1809.service.EmpService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class EmpServiceImpl implements EmpService {
    @Resource
    private EmpMapper empMapper;

    @Override
    public List<Emp> getAllEmp() {
        return empMapper.getAllEmp();
    }
}
