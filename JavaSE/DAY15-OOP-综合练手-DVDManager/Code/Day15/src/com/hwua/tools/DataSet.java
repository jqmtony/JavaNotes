package com.hwua.tools;

import com.hwua.bean.Dvd;
import com.hwua.bean.Record;
import com.hwua.bean.User;

/**
 * 模拟数据库存在
 * 	使用数组来保存数据
 * @author Administrator
 *
 */
public class DataSet {

	public static User[] users;
	public static Dvd[] dvds;
	public static Record[] records;
	
	/**
	 * 通过静态域完成数组的实例化操作
	 */
	static {
		users = new User[10];
		dvds = new Dvd[10];
		records = new Record[10];
		
		userInit();
	}
	
	
	/**
	 * 初始化用户对象数据
	 */
	public static void userInit() {
		User u1 = new User(1,"张三","123456");
		User u2 = new User(2,"李四","123456");
		
		users[0] = u1;
		users[1] = u2;
	}
	
	
	
	
	
	
	
	
	
}
