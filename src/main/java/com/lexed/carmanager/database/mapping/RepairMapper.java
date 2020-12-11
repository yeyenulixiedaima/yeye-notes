package com.lexed.carmanager.database.mapping;

import java.util.List;

import com.lexed.carmanager.database.pojo.Repair;

public interface RepairMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Repair record);

    int insertSelective(Repair record);

    Repair selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Repair record);

    int updateByPrimaryKey(Repair record);
    
    List<Repair> selectAll();
}