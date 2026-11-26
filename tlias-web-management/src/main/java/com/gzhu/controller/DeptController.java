package com.gzhu.controller;

import com.gzhu.pojo.Dept;
import com.gzhu.pojo.Result;
import com.gzhu.service.DeptService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    // 根据id删除数据
    // 获取参数方式一：原始 HttpServletRequest
//    @DeleteMapping("/depts")
//    public Result deleteByID(HttpServletRequest request) {
//        String idStr = request.getParameter("id");
//        Integer id = Integer.parseInt(idStr);
//        return Result.success(idStr);
//    }

    /**
     * 方式二：使用@RequestParam注解，参数 required 默认为 true ，即不传参数将会报错
     */
//    @DeleteMapping("/depts")
//    public Result deleteByID(@RequestParam("id") Integer getID) {
//        return Result.success(getID + "");
//    }

    /**
     * 方式三：当传来的参数名与参数列表中参数名相同时，可以省略@RequestParama注解(推荐)
     */
    @DeleteMapping("/depts")
    public Result deleteByID(Integer id) {
        deptService.deleteByID(id);
        return Result.success(id + "");
    }

}
