package com.accp.dao;

import com.accp.pojo.housetypes;

public interface housetypesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(housetypes record);

    int insertSelective(housetypes record);

    housetypes selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(housetypes record);

    int updateByPrimaryKey(housetypes record);
}