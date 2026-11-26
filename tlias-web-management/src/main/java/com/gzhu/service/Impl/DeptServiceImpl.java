package com.gzhu.service.Impl;

import com.gzhu.mapper.DeptMapper;
import com.gzhu.pojo.Dept;
import com.gzhu.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    private DeptMapper deptMapper;
    @Autowired
    public DeptServiceImpl(DeptMapper deptMapper) {
        this.deptMapper = deptMapper;
    }

    @Override
    public List<Dept> findAll() {
        return deptMapper.findAll();
    }

    @Override
    public void deleteByID(Integer id) {
        deptMapper.deleteByID(id);
    }
}
