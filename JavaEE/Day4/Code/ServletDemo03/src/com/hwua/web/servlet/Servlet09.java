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
		//-- ���ַ�������ʽ���
		//-- ֱ�ӹ涨������鿴�������ʱҪʹ��ʲô�����ʽ
		resp.setHeader("Content-Type", "text/html;charset=UTF-8");
		//-- ����������ͻ��˵�������ʲô����
		resp.setCharacterEncoding("UTF-8");
		
		//-- ���ֽ�������ʽ���
		resp.setHeader("Content-Type", "text/html;charset=UTF-8");
		resp.getOutputStream().write("��������".getBytes("UTF-8"));
		
		//-- ͨ�õ�����
		resp.setContentType("text/html;charset=UTF-8");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
