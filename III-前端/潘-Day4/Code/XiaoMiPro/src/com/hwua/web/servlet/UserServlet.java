package com.hwua.web.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hwua.bean.User;
import com.hwua.service.UserService;
import com.hwua.service.impl.UserServiceImpl;
import com.hwua.web.base.BaseServlet;

@WebServlet("/UserServlet")
public class UserServlet extends BaseServlet{
	
	public UserServlet() {
		super();
		System.out.println("����UserServlet");
		
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -6576105305303622454L;

	
	
	public String goLoginUI(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//-- ��תҳ��
		return "login.html";
	}
	
	public String goRegisterUI(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		return "register.html";
	}
	
	public String userLogin(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//-- 1.���û���������
			
		String name = new String(req.getParameter("username").getBytes("ISO-8859-1"),"UTF-8");
		System.out.println("name:\t" + name);
		String pwd = req.getParameter("password");
		
		//-- 2.��Service
		UserService us = new UserServiceImpl();
		User user = null;
		
		try {
			user = us.userLogin(name,pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//-- ����User
		System.out.println("user:\t" + user);
		//-- 3.��ȡ���
		if (user == null) {
			return "register.html";
		}
		//-- 4.�жϽ��
		return "index.html";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
