package com.hwua.utils;

/**
 * '�û��Ĺ�����
 * @author Administrator
 *
 */
public class UserUtils {

	public static String regexName() {
		String name;
		while (true) {
			System.out.println("�������û���:");
			name = InputUtils.nextString();
			if (!name.matches(FinalData.USER_NAME_REG)) {
				System.out.println("�û�����ʽ����");
				continue;
			}
			break;
		}
		return name;
	}
	
	public static String regexPwd() {
		String pwd;
		while (true) {
			System.out.println("����������");
			pwd = InputUtils.nextString();
			if (!pwd.matches(FinalData.USER_PWD_REG)) {
				System.out.println("�����ʽ����!");
				continue;
			}
			break;
		}
		return pwd;
	}
	
}
