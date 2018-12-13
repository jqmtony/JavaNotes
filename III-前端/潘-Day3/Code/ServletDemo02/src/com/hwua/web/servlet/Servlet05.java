package com.hwua.web.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * 
 * @author Administrator
 *
 */
@WebServlet(name = "Servlet05", urlPatterns = { "/Servlet05" }, loadOnStartup = 1)
public class Servlet05 implements Servlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet被初始化");

	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("config");
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("收到一个请求");
	}

	@Override
	public String getServletInfo() {
		System.out.println("info");
		return null;
	}

	@Override
	public void destroy() {
		System.out.println("销毁Servlet");
	}
}
