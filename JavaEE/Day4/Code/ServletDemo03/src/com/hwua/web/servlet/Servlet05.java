package com.hwua.web.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet05")
public class Servlet05 extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//-- 1.��ȡ���е��������еļ�
		Enumeration<String> headerNames = req.getHeaderNames();
		//-- 2.�Լ���������
		while (headerNames.hasMoreElements()) {
			//-- 3.ȡÿһ��key
			String key = (String) headerNames.nextElement();
			//-- 4����keyȡֵ ���ݼ�ȡָ����value
			String value = req.getHeader(key);
			System.out.println(key + "\t:\t" + value);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
