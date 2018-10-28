package com.hvua.domain.DAY15_implements.Tools;

import com.hvua.domain.DAY15_implements.bean.Dvd;
import com.hvua.domain.DAY15_implements.bean.Record;
import com.hvua.domain.DAY15_implements.bean.User;

public class DataSet {
	/**
	 * 创建数据库，此处使用数组模拟数据库 静态有其唯一性，初始数组定了就是定了
	 */
	public static Dvd[] arrayDvd;
	public static Record[] arrayLend;
	public static User[] arrayUser;
	/**
	 * 实例化数组
	 */
	static {
		arrayDvd = new Dvd[10];
		arrayLend = new Record[10];
		arrayUser = new User[10];
		userInit();
		dvdInit();
	}

	/**
	 * 初始化User对象的数据
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
	 * 初始化Dvd对象的数据
	 */
	private static void dvdInit() {
		Dvd d1 = new Dvd(1,"电影1");
		Dvd d2 = new Dvd(2,"电影2");
		Dvd d3 = new Dvd(3,"电影3");
		Dvd d4 = new Dvd(4,"电影4");

		arrayDvd[0] = d1;
		arrayDvd[1] = d2;
		arrayDvd[2] = d3;
		arrayDvd[3] = d4;
	}

}
