package com.je1809.controller;

import com.je1809.pojo.Emp;
import com.je1809.service.EmpService;
import com.layui.base.DataGrade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class EmpController {
    @Resource
    private EmpService empService;

    @GetMapping("/getAll")
    public List<Emp> getAll(){
        return empService.getAllEmp();
    }

    @GetMapping("/layuiData")
    public DataGrade<Emp> getLayUiData(){
        DataGrade<Emp> data = new DataGrade<>();
        data.setCode(0);
        data.setMsg("");
        List<Emp> allEmp = empService.getAllEmp();
        data.setCount(allEmp.size());
        data.setData(allEmp);
        return data;
    }

}
