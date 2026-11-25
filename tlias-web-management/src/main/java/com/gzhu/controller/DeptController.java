package com.gzhu.controller;

import com.gzhu.pojo.Dept;
import com.gzhu.pojo.Result;
import com.gzhu.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/depts")
    public Result list() {
        List<Dept> res = deptService.findAll();
        return Result.success(res);
    }
}
