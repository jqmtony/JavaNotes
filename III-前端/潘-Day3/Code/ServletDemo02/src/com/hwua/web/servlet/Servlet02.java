package com.hwua.web.servlet;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Servlet02", urlPatterns = { "/Servle02" })
public class Servlet02 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7344023968316803106L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	/**
	 * 实现压缩 指服务端向客户端发送数据时可以对原生数据进行压缩
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String str = "周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片周导那天开新片";
		System.out.println("数据的原始大小:\t" + str.length());

		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		GZIPOutputStream gos = new GZIPOutputStream(bos);
		gos.write(str.getBytes());
		gos.close();

		// -- 得到压缩后的数据
		byte[] target = bos.toByteArray();
		System.out.println("压缩后的数据大小:\t" + target.length);

		// 把压缩后的数据写个客户端
		resp.setHeader("Content-Encoding", "gzip");
		resp.setHeader("Content-Length", target.length + "");

		// -- 把数据写个客户端
		resp.getOutputStream().write(target);
	}
}
