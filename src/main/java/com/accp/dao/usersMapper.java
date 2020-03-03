package com.accp.dao;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.users;

public interface usersMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(users record);

    int insertSelective(users record);

    users selectByName(@Param("username")String username,@Param("userpwd")String userpwd);

    int updateByPrimaryKeySelective(users record);

    int updateByPrimaryKey(users record);
}