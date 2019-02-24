package com.hwua.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xalan.internal.utils.XMLSecurityManager.NameMap;

@WebServlet("/Servlet08")
public class Servlet08 extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("username");
		String pwd = req.getParameter("password");
		if (name.equals("123") && pwd.equals("123")) {
			//-- ��ת����¼�ɹ�ҳ��
			resp.setHeader("refresh", "3;success.html");
			
			resp.setStatus(302);
			resp.setHeader("location", "success.html");
			//-- �ض���
			resp.sendRedirect("success.html");
			
			//-- ����ת��
			req.getRequestDispatcher("success.html").forward(req, resp);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
