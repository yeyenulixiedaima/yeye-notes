package com.lexed.carmanager.database.mapping;

import java.util.List;

import com.lexed.carmanager.database.pojo.Carstatus;

public interface CarstatusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Carstatus record);

    int insertSelective(Carstatus record);

    Carstatus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Carstatus record);

    int updateByPrimaryKey(Carstatus record);
    
    List<Carstatus> selectAll();
}