package com.accp.dao;

import com.accp.pojo.streets;

public interface streetsMapper {
    int deleteByPrimaryKey(Integer streetid);

    int insert(streets record);

    int insertSelective(streets record);

    streets selectByPrimaryKey(Integer streetid);

    int updateByPrimaryKeySelective(streets record);

    int updateByPrimaryKey(streets record);
}