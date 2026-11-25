package com.gzhu.mapper;

import com.gzhu.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptMapper {
    // 3种方法解决名字不一致导致无法获取数据的问题

    // 1. @Results、@Result
//    @Results({
//            @Result(column = "create_time", property = "createTime"),
//            @Result(column = "update_time", property = "updateTime"),
//    })

    // 2. 给不一样的起别名改为一样
//    @Select("select id, name, create_time createTime, update_time as updateTime from dept order by update_time desc")

    // 3. （最常用）在yml文件中启用驼峰命名自动转换
    // mybatis.configuration.map-underscore-to-camel-case: true
    @Select("select id, name, create_time, update_time from dept order by update_time desc")
    public List<Dept> findAll();
}
