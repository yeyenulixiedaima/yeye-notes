package com.lexed.carmanager.database.mapping;

import java.util.List;

import com.lexed.carmanager.database.pojo.Driverstatus;

public interface DriverstatusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Driverstatus record);

    int insertSelective(Driverstatus record);

    Driverstatus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Driverstatus record);

    int updateByPrimaryKey(Driverstatus record);
    
    List<Driverstatus> selectAll();
}