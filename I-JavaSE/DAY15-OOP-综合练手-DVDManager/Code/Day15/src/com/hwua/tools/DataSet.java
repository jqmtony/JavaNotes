package com.hwua.tools;

import com.hwua.bean.Dvd;
import com.hwua.bean.Record;
import com.hwua.bean.User;

/**
 * ģ�����ݿ����
 * 	ʹ����������������
 * @author Administrator
 *
 */
public class DataSet {

	public static User[] users;
	public static Dvd[] dvds;
	public static Record[] records;
	
	/**
	 * ͨ����̬����������ʵ��������
	 */
	static {
		users = new User[10];
		dvds = new Dvd[10];
		records = new Record[10];
		
		userInit();
	}
	
	
	/**
	 * ��ʼ���û���������
	 */
	public static void userInit() {
		User u1 = new User(1,"����","123456");
		User u2 = new User(2,"����","123456");
		
		users[0] = u1;
		users[1] = u2;
	}
	
	
	
	
	
	
	
	
	
}
