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
		System.out.println("04Servlet��ʵ����");
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
	 * ' ����ˢ��
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//-- ���������3���ˢ��.ˢ�µ�ָ��ҳ��
		resp.setHeader("refresh", "3;https://www.baidu.com");	
	}
}











