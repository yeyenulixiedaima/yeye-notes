package com.lexed.carmanager.database.mapping;

import java.util.List;

import com.lexed.carmanager.database.pojo.Dynamic;

public interface DynamicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Dynamic record);

    int insertSelective(Dynamic record);

    Dynamic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dynamic record);

    int updateByPrimaryKey(Dynamic record);
    
    List<Dynamic> selectAll();
}