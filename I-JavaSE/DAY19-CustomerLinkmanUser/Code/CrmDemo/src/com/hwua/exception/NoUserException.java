package com.hwua.exception;

/**
 * 
 * @author Administrator
 *
 */
public class NoUserException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4467180201519647662L;

	@Override
	public String getMessage() {
		return "用户不存在";
	}
}
