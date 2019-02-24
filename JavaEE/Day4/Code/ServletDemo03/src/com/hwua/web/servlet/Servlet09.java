package com.hwua.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xalan.internal.utils.XMLSecurityManager.NameMap;

@WebServlet("/Servlet09")
public class Servlet09 extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//-- 以字符流的形式输出
		//-- 直接规定浏览器查看这个数据时要使用什么编码格式
		resp.setHeader("Content-Type", "text/html;charset=UTF-8");
		//-- 设置输出到客户端的内容是什么编码
		resp.setCharacterEncoding("UTF-8");
		
		//-- 以字节流的形式输出
		resp.setHeader("Content-Type", "text/html;charset=UTF-8");
		resp.getOutputStream().write("这是中文".getBytes("UTF-8"));
		
		//-- 通用的设置
		resp.setContentType("text/html;charset=UTF-8");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
