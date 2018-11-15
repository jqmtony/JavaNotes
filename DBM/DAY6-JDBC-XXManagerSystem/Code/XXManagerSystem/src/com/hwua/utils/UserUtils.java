package com.hwua.utils;

/**
 * '用户的工具类
 * @author Administrator
 *
 */
public class UserUtils {

	public static String regexName() {
		String name;
		while (true) {
			System.out.println("请输入用户名:");
			name = InputUtils.nextString();
			if (!name.matches(FinalData.USER_NAME_REG)) {
				System.out.println("用户名格式不对");
				continue;
			}
			break;
		}
		return name;
	}
	
	public static String regexPwd() {
		String pwd;
		while (true) {
			System.out.println("请输入密码");
			pwd = InputUtils.nextString();
			if (!pwd.matches(FinalData.USER_PWD_REG)) {
				System.out.println("密码格式不对!");
				continue;
			}
			break;
		}
		return pwd;
	}
	
}
