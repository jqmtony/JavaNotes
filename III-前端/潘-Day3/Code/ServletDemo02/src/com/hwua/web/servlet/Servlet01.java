package com.hwua.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Servlet01", urlPatterns = { "/Servle01" })
public class Servlet01 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7344023968316803106L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setStatus(302);
		//-- 通过设置响应头参数来实现页面跳转
		resp.setHeader("Location", "https://www.baidu.com");
	}
}











