package com.hwua.util;

import java.util.ArrayList;

import com.hwua.bean.Customer;
import com.hwua.bean.LinkMan;
import com.hwua.bean.User;

public class DataSet {
	private static int userId = 1;
	private static int custId = 1;
	private static int linkId = 1;
	
	public static ArrayList<Customer> customerList;
	public static ArrayList<LinkMan> linkManList;
	public static ArrayList<User> userList;

	static {
		initUser();
		initCustomer();
		initLinkMan();
	}
	
	
	public static  int getLastUserId() {
		return userId ++ ;
	}
	
	public static  int getLastCustId() {
		return custId ++;
	}
	
	public static  int getLastLinkId() {
		return linkId ++;
	}
	

	public static void initCustomer() {
		customerList = new ArrayList<>();
	}

	public static void initLinkMan() {
		linkManList = new ArrayList<>();
	}

	public static void initUser() {
		userList = new ArrayList<>();
		User u = new User("admin", "Вёзм", "123456");
		userList.add(u);
	}

}
