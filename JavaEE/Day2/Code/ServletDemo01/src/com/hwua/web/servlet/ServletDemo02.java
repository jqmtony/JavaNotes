package com.hwua.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo02 extends HttpServlet{

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
		//-- ����������������������������ı����ʽ
		req.setCharacterEncoding("UTF-8");
		//-- ������Ӧ������
		resp.setContentType("text/html;charset=UTF-8");
		
		//-- ��ȡ���Ĳ���
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		//-- ����Ϊ��.�����������֤Ӧ����ǰ�˵�js���
		if ("".equals(username)||username == null || "".equals(password)|| password == null)  {
			//-- ��ʾ�ͻ��˲������ύ��
			resp.getWriter().write("<script type='text/javascript'>alert('����Ϣ������Ϊ��')</script>");
			resp.addHeader("refresh", "1;url=index.html");
			return;
		}
		
		
		if ("admin".equals(username) && "admin".equals(password)) {
			resp.getWriter().write("<script>alert('��¼�ɹ�')</script>");
			//-- ����ҳ����ת
			resp.addHeader("refresh", "0;url=success.html");
		}else {
			resp.getWriter().write("<script>alert('�û������������')</script>");
			//-- ����ҳ����ת
			resp.addHeader("refresh", "0;url=index.html");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
