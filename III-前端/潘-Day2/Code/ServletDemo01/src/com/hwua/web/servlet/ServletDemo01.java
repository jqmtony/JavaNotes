package com.hwua.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo01 extends HttpServlet{

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
		//-- ������ܵ��Ĳ��� 
		//���ݿؼ���name������ȡֵ
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		System.out.println("username:\t" + username);
		System.out.println("password:\t" + password);
		//--����Service.Service����Dao
		//-- ���ñ����ʽһ��Ҫ�ڻ�ȡ��֮ǰ����.
		resp.setContentType("text/html;charset=UTF-8");
		//-- ��ȡ�����
		PrintWriter out = resp.getWriter();
		if ("admin".equals(username) && "admin".equals(password)) {
			out.println("��¼�ɹ�!");			
		}else {
			out.println("��¼ʧ��!");			
		}
		
		
	}
}
