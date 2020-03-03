package com.accp.dao;

import com.accp.pojo.countys;

public interface countysMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(countys record);

    int insertSelective(countys record);

    countys selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(countys record);

    int updateByPrimaryKey(countys record);
}