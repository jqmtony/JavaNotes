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
		//-- 获取客户端发送请求是的完整URL
		System.out.println("req.getRequestURL():\t" + req.getRequestURL());
		//-- 只获取请求中的资源部分
		System.out.println("req.getRequestURI():\t"+req.getRequestURI());
		//-- 获取请求行的参数部分
		System.out.println("req.getQueryString():\t"+req.getQueryString());
		//-- 获取发送请求的客户主机的IP地址
		System.out.println("req.getRemoteAddr():\t"+req.getRemoteAddr());
		//-- 获取发送请求的主机的完整主机名
		System.out.println("req.getRemoteHost():\t"+req.getRemoteHost());
		//-- 获取Web服务器的IP地址
		System.out.println("req.getLocalAddr():\t"+req.getLocalAddr());
		//-- 获取Web服务器的主机名
		System.out.println("req.getLocalName():\t" + req.getLocalName());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
