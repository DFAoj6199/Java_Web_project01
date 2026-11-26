package com.gzhu.service;

import com.gzhu.pojo.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> findAll();

    void deleteByID(Integer id);
}
