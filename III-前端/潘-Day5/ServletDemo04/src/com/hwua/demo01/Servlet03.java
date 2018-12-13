package com.hwua.demo01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet03")
public class Servlet03 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		Cookie cookie = new Cookie("aa", "cc");
		resp.addCookie(cookie);
		resp.getWriter().write("«Î«Û≥…π¶!");
		
		Cookie[] cs = req.getCookies();
		for (Cookie c : cs) {
			System.out.println("c.getName:\t" + c.getName() + "\tc.getValue():\t" + c.getValue());
		}
		
		
		
		
	}
}
