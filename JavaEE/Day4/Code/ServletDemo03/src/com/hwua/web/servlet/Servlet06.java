package com.hwua.web.servlet;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet06")
public class Servlet06 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		// -- һ������Ӧһ��ֵ
		String password = req.getParameter("password");
		String gender = req.getParameter("gender");
		// -- ��ȡһ������Ӧ���ֵ
		String[] likes = req.getParameterValues("like");

		System.out.println("username:\t" + username);
		System.out.println("password:\t" + password);
		System.out.println("gender:\t" + gender);
		for (String str : likes) {
			System.out.println("likes:\t" + str);
		}

		// -- ��ȡ���еļ�ֵ��
		Map<String, String[]> maps = req.getParameterMap();

		// -- ��ȡ���еļ�
		Set<String> keys = maps.keySet();
		// -- ͨ������ȡֵ
		for (String key : keys) {
			System.out.print("key:\t" + key + "\t:\t");
			String[] results = req.getParameterValues(key);
			for (String res : results) {
				System.out.println(res);
			}
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
