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
		//-- 经过URLEncoding后的内容
		String name = req.getParameter("name");
		//-- 还原成ISO-8859-1
		byte[] buffer = name.getBytes("ISO-8859-1");
		//-- 在转成字符串
		name = new String(buffer,"UTF-8");
		//-- 上面两行可以合并成一行写
		name = new String(name.getBytes("ISO-8859-1"),"UTF-8");
		//-- 除此以外还可以直接在Tomcat的server.xml中添加编码格式	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//-- 一定要在获取参数之前先设置编码格式.用于解决POST提交带来的乱码
		req.setCharacterEncoding("UTF-8");
	}

}
