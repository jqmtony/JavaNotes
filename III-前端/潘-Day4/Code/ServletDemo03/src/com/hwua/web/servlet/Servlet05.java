package com.hwua.web.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet05")
public class Servlet05 extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//-- 1.获取所有的请求行中的键
		Enumeration<String> headerNames = req.getHeaderNames();
		//-- 2.对集合做遍历
		while (headerNames.hasMoreElements()) {
			//-- 3.取每一个key
			String key = (String) headerNames.nextElement();
			//-- 4根据key取值 根据键取指定的value
			String value = req.getHeader(key);
			System.out.println(key + "\t:\t" + value);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
