package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.houses;

public interface housesMapper {
    int deleteByPrimaryKey(Integer id);
    int insert(houses record);

    int insertSelective(houses record);
    
    int updateByPrimaryKey(houses record);
    
    houses queryById(Integer id);
    
    List<houses> queryByuserId(Integer userid);
    
    List<houses> querybyall(@Param("title")String title);
    List<houses> queryByids(Integer id);
}