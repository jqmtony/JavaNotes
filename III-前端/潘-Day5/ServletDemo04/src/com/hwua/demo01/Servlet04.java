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
	 * 1.ҳ�浥����Ʒ.�ṩ��Ʒ��ID��Servlet
	 * 2.Servlet�յ������.�������л�ȡCookie����
	 * 3.�ж�Cookie�������Ƿ����ָ����Cookie.�ص�:key��id
	 * 4.���������.�����һ�η���.
	 * 4.1 �ṩCookie���� ��id�Ͷ�Ӧ��ֵ���뵽cookie��.
	 * 5.�������.ȡ�����е�ֵ׷���µ�����
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
		
		//-- ���»ص��б�ҳ��.
		resp.sendRedirect("list.jsp");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
