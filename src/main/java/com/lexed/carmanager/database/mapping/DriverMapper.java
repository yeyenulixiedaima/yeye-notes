package com.lexed.carmanager.database.mapping;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lexed.carmanager.database.pojo.Driver;

public interface DriverMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Driver record);

    int insertSelective(Driver record);

    Driver selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Driver record);

    int updateByPrimaryKey(Driver record);
    
    List<Driver> selectAll();
    
    Driver selectByUesrname(@Param("uesrname")String uesrname);
}