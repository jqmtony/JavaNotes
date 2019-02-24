package com.hwua.demo01;

import javax.servlet.http.Cookie;

public class CookieUtils {
	
	/**
	 * 根据key从cookies中寻找指定的Cookie
	 * @param cookies
	 * @param key
	 * @return
	 */
	public static Cookie getCookie(Cookie[] cookies,String key) {	
		if (cookies != null) {
			for (Cookie c : cookies) {
				if (key.equals(c.getName())) {
					return c;
				}
			}
		}
		
		return null;
	}

}
