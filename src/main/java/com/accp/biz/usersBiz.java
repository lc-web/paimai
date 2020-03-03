package com.accp.biz;

import com.accp.dao.usersMapper;
import com.accp.util.SqlSessionUtil;
import com.accp.pojo.users;

public class usersBiz {
	 
	public users selectByName(String username, String userpwd) {
		usersMapper user = SqlSessionUtil.getSession().getMapper(usersMapper.class);
			return user.selectByName(username, userpwd);
	}
	//注册用户
	public int adduser(users record) {
		usersMapper user = SqlSessionUtil.getSession().getMapper(usersMapper.class);
		 return user.insert(record);
	}
	
}
