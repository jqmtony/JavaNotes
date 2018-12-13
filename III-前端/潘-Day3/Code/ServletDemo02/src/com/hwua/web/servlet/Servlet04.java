package com.hwua.web.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Servlet04", urlPatterns = { "/Servlet04" },loadOnStartup = 0)
public class Servlet04 extends HttpServlet {
	@Override
	public void init() throws ServletException {
		System.out.println("04Servlet被实例化");
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -7344023968316803106L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	/**
	 * ' 设置刷新
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//-- 让浏览器隔3秒后刷新.刷新到指定页面
		resp.setHeader("refresh", "3;https://www.baidu.com");	
	}
}











