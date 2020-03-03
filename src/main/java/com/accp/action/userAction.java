package com.accp.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.accp.biz.houseBiz;
import com.accp.biz.usersBiz;
import com.accp.pojo.houses;
import com.accp.pojo.users;
import com.accp.util.CgLibTransProxyUtil;
import com.alibaba.fastjson.JSON;

/**
 * Servlet implementation class userAction
 */
public class userAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private usersBiz users=CgLibTransProxyUtil.getTransProxyObject(usersBiz.class);
	 private houseBiz house=CgLibTransProxyUtil.getTransProxyObject(houseBiz.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//设置请求和响应的编码格式
		response.setContentType("text/html");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		//获取页面提交的参数
		String p=request.getParameter("p");
		try {
			Method method=this.getClass().getDeclaredMethod(p, HttpServletRequest.class,HttpServletResponse.class);
			method.invoke(this, request,response);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	private void queryByname(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//获取页面提交的参数
		String username=request.getParameter("username");
		String userpwd=request.getParameter("userpwd");
		PrintWriter out=response.getWriter();
		Map<String, Object> message=new HashMap<String, Object>();
		
		users user=users.selectByName(username, userpwd);
		if(user!=null) {

			message.put("code", "200");
			message.put("user", user);
		}else{
			message.put("code", "500");
		}
		out.write(JSON.toJSONString(message));
		out.flush();
		out.close();
	}
	private void adduser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取页面提交的参数
		PrintWriter out=response.getWriter();
		String jsonstr=request.getParameter("jsonStr");
		Map<String, Object> message=new HashMap<String, Object>();
		try {
			users.adduser(JSON.parseObject(jsonstr,users.class));
			message.put("code", "200");
		} catch (Exception e) {
			message.put("code", "500");
			message.put("msg", e.getMessage());
		}
		out.write(JSON.toJSONString(message));
		out.flush();
		out.close();
	}
	//根据登录传过来的用户编号做查询
	private void queryById(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		//获取页面提交的参数
		Integer pageNum = Integer.parseInt(request.getParameter("pp"));
		Integer pageSize = Integer.parseInt(request.getParameter("s"));
		String userid=request.getParameter("userid");
		PrintWriter out=response.getWriter();
		//System.out.println(house.queryByuserId(Integer.parseInt(userid),pageNum, pageSize).getList());
		out.write(JSON.toJSONString(house.queryByuserId(Integer.parseInt(userid),pageNum, pageSize)));
		out.flush();
		out.close();
	}
	//添加房屋
	private void save(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		//获取页面提交的参数
		Map<String,String> message=new HashMap<String,String>();
		String jsonStr=request.getParameter("jsonStr");
		PrintWriter out=response.getWriter();
		//反虚拟化
		try {
			house.savehouse(JSON.parseObject(jsonStr, houses.class));
			message.put("code", "200");
		} catch (Exception e) {
			// TODO: handle exception
			message.put("code", "500");
			message.put("msg", e.getMessage());
		}
		out.write(JSON.toJSONString(message));//虚拟化
		out.flush();
		out.close();
	}
	private void deleteByKey(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		PrintWriter out=response.getWriter();
		Map<String, Object> map=new HashMap<String, Object>();
		String id=request.getParameter("id");
		try {
			house.deleteByKey(Integer.parseInt(id));
			map.put("code", "200");
		} catch (Exception e) {
			// TODO: handle exception
			map.put("code", "500");
			map.put("msg", e.getMessage());
		}
		out.write(JSON.toJSONString(map));
	}
		private void queryByrId(HttpServletRequest request, HttpServletResponse response) throws IOException {
			// TODO Auto-generated method stub
			//获取页面提交的参数
			String id=request.getParameter("uid");
			PrintWriter out=response.getWriter();
			out.write(JSON.toJSONString(house.queryByid(Integer.parseInt(id))));
			out.flush();
			out.close();
		}
		private void updateById(HttpServletRequest request, HttpServletResponse response) throws IOException {
			PrintWriter out=response.getWriter();
			//获取页面提交的参数
			String jsonStr=request.getParameter("jsonStr");
			Map<String,String> message=new HashMap<String,String>();
			//反虚拟化
			try {
				house.updatekey(JSON.parseObject(jsonStr, houses.class));
				System.out.println(jsonStr);
				message.put("code", "200");
			} catch (Exception e) {
				message.put("code", "500");
				message.put("msg", e.getMessage());
			}
			out.write(JSON.toJSONString(message));
			out.flush();
			out.close();
		}
		private void querybyall(HttpServletRequest request, HttpServletResponse response) throws IOException {
			PrintWriter out=response.getWriter();
			String title=request.getParameter("title");
			Integer pageNum = Integer.parseInt(request.getParameter("pp"));
			Integer pageSize = Integer.parseInt(request.getParameter("s"));
			out.write(JSON.toJSONString(house.querybyall(title,pageNum, pageSize)));
			out.flush();
			out.close();
		}
		private void queryByrIds(HttpServletRequest request, HttpServletResponse response) throws IOException {
			// TODO Auto-generated method stub
			//获取页面提交的参数
			String id=request.getParameter("id");
			System.out.println(id);
			Integer pageNum = Integer.parseInt(request.getParameter("pp"));
			System.out.println(pageNum);
			Integer pageSize = Integer.parseInt(request.getParameter("s"));
			System.out.println(pageSize);
			PrintWriter out=response.getWriter();
			out.write(JSON.toJSONString(house.querybyallss(Integer.parseInt(id), pageNum, pageSize)));
			out.flush();
			out.close();
		}
}
