package com.accp.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.accp.biz.houseBiz;
import com.accp.util.CgLibTransProxyUtil;
import com.alibaba.fastjson.JSON;

/**
 * Servlet implementation class houseAction
 */
public class houseAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private houseBiz house=CgLibTransProxyUtil.getTransProxyObject(houseBiz.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public houseAction() {
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
		//获取页面提交的参数
		String p=request.getParameter("p");
		try {
			Method method=this.getClass().getDeclaredMethod(p, HttpServletRequest.class,HttpServletResponse.class);
			method.invoke(this, request,response);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	

}
