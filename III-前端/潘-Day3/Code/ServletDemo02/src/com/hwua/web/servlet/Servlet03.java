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
	 * ' 告诉客户端返回的数据是什么类型
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// -- 把img/Koala.jpg发送给客户端
		InputStream is = this.getServletContext().getResourceAsStream("/img/Koala.jpg");
		byte[] buffer = new byte[1024];
		int length = 0;
		// -- 设置返回的数据类型
		resp.setHeader("content-type", "image/jpeg");
		OutputStream os = resp.getOutputStream();
		while (-1 != (length = is.read(buffer))) {
			os.write(buffer, 0, length);
		}
	}
}











