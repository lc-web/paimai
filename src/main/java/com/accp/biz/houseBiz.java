package com.accp.biz;



import java.util.List;

import com.accp.dao.housesMapper;
import com.accp.pojo.houses;
import com.accp.util.SqlSessionUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


public class houseBiz {
	public PageInfo<houses> queryByuserId(Integer userid,Integer pageNum, Integer pageSize){
		housesMapper user = SqlSessionUtil.getSession().getMapper(housesMapper.class);
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<houses>(user.queryByuserId(userid));
		
	}
	public int savehouse(houses record) {
		housesMapper user = SqlSessionUtil.getSession().getMapper(housesMapper.class);
		return user.insert(record);
	}
	public int deleteByKey(Integer id) {
		housesMapper user = SqlSessionUtil.getSession().getMapper(housesMapper.class);
		return user.deleteByPrimaryKey(id);
	}
	public houses queryByid(Integer id) {
		housesMapper user = SqlSessionUtil.getSession().getMapper(housesMapper.class);
		return user.queryById(id);
	}
	public int updatekey(houses record) {
		housesMapper user = SqlSessionUtil.getSession().getMapper(housesMapper.class);
		return user.updateByPrimaryKey(record);
	}
	public PageInfo<houses> querybyall(String title,Integer pageNum, Integer pageSize){
		housesMapper user = SqlSessionUtil.getSession().getMapper(housesMapper.class);
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<houses>(user.querybyall(title));
		
	}
	public PageInfo<houses> querybyallss(Integer id,Integer pageNum, Integer pageSize){
		housesMapper user = SqlSessionUtil.getSession().getMapper(housesMapper.class);
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<houses>(user.queryByids(id));
		
	}
}
