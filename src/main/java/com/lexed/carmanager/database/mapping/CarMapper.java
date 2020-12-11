package com.lexed.carmanager.database.mapping;

import java.util.List;

import com.lexed.carmanager.database.pojo.Car;

public interface CarMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Car record);

    int insertSelective(Car record);

    Car selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Car record);

    int updateByPrimaryKey(Car record);
    
    List<Car> selectAll();
}