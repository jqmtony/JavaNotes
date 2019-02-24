package com.hwua.web.base;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet�Ĺ�����.
 * 
 * @author Administrator
 *
 */
@WebServlet("/BaseServlet")
public class BaseServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -746911182294658956L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = "";
		// -- ������һ������������.
		String methodName = req.getParameter("method");
	
		// Class ����������������������Ϣ.���е��������еķ���.����Class������
		Class<?> clas = this.getClass();
		// -- ͨ��clas�����ȡָ���ķ���.
		try {
			Method method = clas.getMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
			// -- ִ�з��� �����this����˭!
			path = (String) method.invoke(this, req, resp);
			req.getRequestDispatcher(path).forward(req, resp);
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
