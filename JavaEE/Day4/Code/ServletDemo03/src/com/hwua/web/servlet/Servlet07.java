package com.hwua.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xalan.internal.utils.XMLSecurityManager.NameMap;

@WebServlet("/Servlet07")
public class Servlet07 extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//-- ����URLEncoding�������
		String name = req.getParameter("name");
		//-- ��ԭ��ISO-8859-1
		byte[] buffer = name.getBytes("ISO-8859-1");
		//-- ��ת���ַ���
		name = new String(buffer,"UTF-8");
		//-- �������п��Ժϲ���һ��д
		name = new String(name.getBytes("ISO-8859-1"),"UTF-8");
		//-- �������⻹����ֱ����Tomcat��server.xml����ӱ����ʽ	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//-- һ��Ҫ�ڻ�ȡ����֮ǰ�����ñ����ʽ.���ڽ��POST�ύ����������
		req.setCharacterEncoding("UTF-8");
	}

}
