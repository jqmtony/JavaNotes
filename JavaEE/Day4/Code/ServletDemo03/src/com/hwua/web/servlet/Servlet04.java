package com.hwua.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet04")
public class Servlet04 extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//-- ��ȡ�ͻ��˷��������ǵ�����URL
		System.out.println("req.getRequestURL():\t" + req.getRequestURL());
		//-- ֻ��ȡ�����е���Դ����
		System.out.println("req.getRequestURI():\t"+req.getRequestURI());
		//-- ��ȡ�����еĲ�������
		System.out.println("req.getQueryString():\t"+req.getQueryString());
		//-- ��ȡ��������Ŀͻ�������IP��ַ
		System.out.println("req.getRemoteAddr():\t"+req.getRemoteAddr());
		//-- ��ȡ�������������������������
		System.out.println("req.getRemoteHost():\t"+req.getRemoteHost());
		//-- ��ȡWeb��������IP��ַ
		System.out.println("req.getLocalAddr():\t"+req.getLocalAddr());
		//-- ��ȡWeb��������������
		System.out.println("req.getLocalName():\t" + req.getLocalName());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
