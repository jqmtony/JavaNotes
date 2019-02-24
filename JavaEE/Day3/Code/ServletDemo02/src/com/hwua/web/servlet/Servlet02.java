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
	 * ʵ��ѹ�� ָ�������ͻ��˷�������ʱ���Զ�ԭ�����ݽ���ѹ��
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String str = "�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ�ܵ����쿪��Ƭ";
		System.out.println("���ݵ�ԭʼ��С:\t" + str.length());

		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		GZIPOutputStream gos = new GZIPOutputStream(bos);
		gos.write(str.getBytes());
		gos.close();

		// -- �õ�ѹ���������
		byte[] target = bos.toByteArray();
		System.out.println("ѹ��������ݴ�С:\t" + target.length);

		// ��ѹ���������д���ͻ���
		resp.setHeader("Content-Encoding", "gzip");
		resp.setHeader("Content-Length", target.length + "");

		// -- ������д���ͻ���
		resp.getOutputStream().write(target);
	}
}
