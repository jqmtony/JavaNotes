package com.hwua.demo01;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet04")
public class Servlet04 extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5455879965777441391L;

	/*	
	 * 1.页面单击商品.提供商品的ID到Servlet
	 * 2.Servlet收到请求后.从请求中获取Cookie数组
	 * 3.判断Cookie数组中是否包含指定的Cookie.特点:key是id
	 * 4.如果不包含.代表第一次访问.
	 * 4.1 提供Cookie对象 把id和对应的值放入到cookie中.
	 * 5.如果包含.取出已有的值追加新的内容
	 * 
	 * 
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		System.out.println(id);
		Cookie[] cookies = req.getCookies();
		Cookie cookie = CookieUtils.getCookie(cookies,"id");
		if (cookie == null) {
			Cookie c = new Cookie("id", id);
			c.setMaxAge(60*60);
			resp.addCookie(c);
		}else {
			String oldValue = cookie.getValue();
			List<String> list = Arrays.asList(oldValue.split("#"));
			LinkedList<String> link = new LinkedList<>(list);
			if (link.contains(id)) {
				link.remove(id);
				link.addFirst(id);
			}else {
//				if (link.size()>2) {
//					link.removeLast();
//					link.addFirst(id);
//				}else {
//					link.addFirst(id);
//				}
				link.addFirst(id);
			}
			id = "";
			for (String str : link) {
				id+=(str+"#");
			}
			id = id.substring(0, id.length()-1);
			System.out.println("id:\t" + id);
			cookie.setValue(id);
			resp.addCookie(cookie);
			
		}
		
		//-- 重新回到列表页面.
		resp.sendRedirect("list.jsp");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
