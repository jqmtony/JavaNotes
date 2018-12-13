package com.hwua.web.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet07 extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 325748913419914410L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//-- 1.获取ServletConfig
		ServletConfig config = this.getServletConfig();
		//-- 2.通过config获取name
		System.out.println(config.getServletName());
		//-- 3.通过config获取上下文
		config.getServletContext();
		//-- 4.根据键取值
		String value = config.getInitParameter("address");
		System.out.println("value:\t" + value);
		//-- 5.获取所有的键.
		Enumeration<String> parameterNames = config.getInitParameterNames();
		while (parameterNames.hasMoreElements()) {
			//-- 获取的是键
			String element = parameterNames.nextElement();
			System.out.println(element);
			//-- 再根据键进行取值
			System.out.println(config.getInitParameter(element));
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
