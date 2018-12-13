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
 * Servlet的工具类.
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
		// -- 将会是一个方法的名称.
		String methodName = req.getParameter("method");
	
		// Class 对象里面包含了类的所有信息.类中的属性类中的方法.都在Class对象中
		Class<?> clas = this.getClass();
		// -- 通过clas对象获取指定的方法.
		try {
			Method method = clas.getMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
			// -- 执行方法 这里的this代表谁!
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
