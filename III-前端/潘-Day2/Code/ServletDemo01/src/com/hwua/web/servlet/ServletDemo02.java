package com.hwua.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo02 extends HttpServlet{

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
		//-- 避免请求中有中文乱码设置请求的编码格式
		req.setCharacterEncoding("UTF-8");
		//-- 避免响应的乱码
		resp.setContentType("text/html;charset=UTF-8");
		
		//-- 获取表单的参数
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		//-- 避免为空.理论上这个验证应该是前端的js完成
		if ("".equals(username)||username == null || "".equals(password)|| password == null)  {
			//-- 提示客户端不可以提交空
			resp.getWriter().write("<script type='text/javascript'>alert('表单信息不可以为空')</script>");
			resp.addHeader("refresh", "1;url=index.html");
			return;
		}
		
		
		if ("admin".equals(username) && "admin".equals(password)) {
			resp.getWriter().write("<script>alert('登录成功')</script>");
			//-- 进行页面跳转
			resp.addHeader("refresh", "0;url=success.html");
		}else {
			resp.getWriter().write("<script>alert('用户名或密码错误')</script>");
			//-- 进行页面跳转
			resp.addHeader("refresh", "0;url=index.html");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
