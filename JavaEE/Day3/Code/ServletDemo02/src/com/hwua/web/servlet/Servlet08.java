package com.hwua.web.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet08 extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 325748913419914410L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//-- 1.��ȡServletConfig
		ServletConfig config = this.getServletConfig();
		//-- 2.ͨ��config��ȡname
		System.out.println(config.getServletName());
		//-- 3.ͨ��config��ȡ������
		ServletContext context = config.getServletContext();
		//-- 4.���ݼ�ȡֵ
		String value = config.getInitParameter("address");
		System.out.println(value);
		String value1 = context.getInitParameter("address");
		System.out.println(value1);
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
