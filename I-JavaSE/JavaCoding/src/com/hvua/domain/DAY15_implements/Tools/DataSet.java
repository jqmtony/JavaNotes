package com.hvua.domain.DAY15_implements.Tools;

import com.hvua.domain.DAY15_implements.bean.Dvd;
import com.hvua.domain.DAY15_implements.bean.Record;
import com.hvua.domain.DAY15_implements.bean.User;

public class DataSet {
	/**
	 * �������ݿ⣬�˴�ʹ������ģ�����ݿ� ��̬����Ψһ�ԣ���ʼ���鶨�˾��Ƕ���
	 */
	public static Dvd[] arrayDvd;
	public static Record[] arrayLend;
	public static User[] arrayUser;
	/**
	 * ʵ��������
	 */
	static {
		arrayDvd = new Dvd[10];
		arrayLend = new Record[10];
		arrayUser = new User[10];
		userInit();
		dvdInit();
	}

	/**
	 * ��ʼ��User���������
	 * 
	 * @return
	 */
	public static void userInit() {
		User u1 = new User(1, "name1", "123456");
		User u2 = new User(2, "name2", "123456");
		User u3 = new User(3, "name3", "123456");
		User u4 = new User(4, "name4", "123456");

		arrayUser[0] = u1;
		arrayUser[1] = u2;
		arrayUser[2] = u3;
		arrayUser[3] = u4;
	}

	/**
	 * ��ʼ��Dvd���������
	 */
	private static void dvdInit() {
		Dvd d1 = new Dvd(1,"��Ӱ1");
		Dvd d2 = new Dvd(2,"��Ӱ2");
		Dvd d3 = new Dvd(3,"��Ӱ3");
		Dvd d4 = new Dvd(4,"��Ӱ4");

		arrayDvd[0] = d1;
		arrayDvd[1] = d2;
		arrayDvd[2] = d3;
		arrayDvd[3] = d4;
	}

}
