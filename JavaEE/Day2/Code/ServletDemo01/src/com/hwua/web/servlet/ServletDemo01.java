package com.hwua.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo01 extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2897867957786202507L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//-- 输出所受到的参数 
		//根据控件的name属性来取值
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		System.out.println("username:\t" + username);
		System.out.println("password:\t" + password);
		//--请求Service.Service请求Dao
		//-- 设置编码格式一定要在获取流之前设置.
		resp.setContentType("text/html;charset=UTF-8");
		//-- 获取输出流
		PrintWriter out = resp.getWriter();
		if ("admin".equals(username) && "admin".equals(password)) {
			out.println("登录成功!");			
		}else {
			out.println("登录失败!");			
		}
		
		
	}
}
