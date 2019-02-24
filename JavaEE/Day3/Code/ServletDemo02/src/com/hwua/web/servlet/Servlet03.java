package com.hwua.web.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Servlet03", urlPatterns = { "/Servle03" })
public class Servlet03 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7344023968316803106L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	/**
	 * ' ���߿ͻ��˷��ص�������ʲô����
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// -- ��img/Koala.jpg���͸��ͻ���
		InputStream is = this.getServletContext().getResourceAsStream("/img/Koala.jpg");
		byte[] buffer = new byte[1024];
		int length = 0;
		// -- ���÷��ص���������
		resp.setHeader("content-type", "image/jpeg");
		OutputStream os = resp.getOutputStream();
		while (-1 != (length = is.read(buffer))) {
			os.write(buffer, 0, length);
		}
	}
}











