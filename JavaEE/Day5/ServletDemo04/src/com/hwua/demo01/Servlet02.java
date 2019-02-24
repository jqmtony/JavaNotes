package com.hwua.demo01;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.glass.ui.SystemClipboard;

@WebServlet("/Servlet02")
public class Servlet02 extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7811333684257512131L; 

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		resp.setContentType("text/html;charset=utf-8");
		//-- 从请求中获取cookie
		Cookie cookie = getCookie(req.getCookies(), "lastLoginTime");
		if (cookie == null) {
			Cookie c = new Cookie("lastLoginTime", System.currentTimeMillis()+"");
			c.setMaxAge(60*60);
			resp.addCookie(c);
		}else {
			long lastLoginTime = Long.parseLong(cookie.getValue());
			resp.getWriter().write("欢迎:" + username + "上次登录时间:" + new Date(lastLoginTime));
			
			cookie.setValue(System.currentTimeMillis()+"");
			resp.addCookie(cookie);
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
	
	
	/**
	 * 取Cookie
	 * @param cookies
	 * @param key
	 * @return
	 */
	public Cookie getCookie(Cookie[] cookies,String key) {
		if (cookies != null) {
			for (Cookie c : cookies) {
				if (key.equals(c.getName())) {
					return c;
				}
			}
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
}
