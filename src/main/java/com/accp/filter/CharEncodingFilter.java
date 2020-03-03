package com.accp.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CharEncodingFilter implements Filter {
	
	private String charset;

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain chain)
			throws IOException, ServletException {
		//1.转换
		HttpServletRequest request=(HttpServletRequest)arg0;
		HttpServletResponse response=(HttpServletResponse)arg1;
		//2.过滤逻辑
		response.setContentType("text/html;charset="+charset);
		response.setCharacterEncoding(charset);
		//获得请求方式
		String reqMethod=request.getMethod();
		if(reqMethod.equalsIgnoreCase("post")) {
			request.setCharacterEncoding(charset);
		}
		chain.doFilter(request, response);//非常重要

	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		//获得初始化参数
		charset=config.getInitParameter("charset");
	}

}
