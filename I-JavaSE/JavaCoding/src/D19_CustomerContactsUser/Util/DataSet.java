package D19_CustomerContactsUser.Util;

import java.util.ArrayList;

import D19_CustomerContactsUser.Bean.Customer;
import D19_CustomerContactsUser.Bean.LinkMan;
import D19_CustomerContactsUser.Bean.User;

public class DataSet {
	// 自动添加ID，ID是唯一的
	private static int userID = 1;
	private static int customerID = 1;
	private static int linkmanID = 1;
	// 使用ArrayList创造对象
	public static ArrayList<Customer> customers;
	public static ArrayList<LinkMan> linkMans;
	public static ArrayList<User> users;

	// 生成ID
	public static int getLastUserID() {
		return userID++;
	}

	public static int getLastCustomerID() {
		return customerID++;
	}

	public static int getLastLinkManID() {
		return linkmanID++;
	}

	// 初始化
	static {
		userInit();
		customerInit();
		linkmanInit();
	}

	public static void userInit() {
		users = new ArrayList<>();
		User u1 = new User(1, "张三", "张三", "123");
		User u2 = new User(1, "李四", "李四", "123");
		User u3 = new User(1, "王五", "王五", "123");
		users.add(u1);
		users.add(u2);
		users.add(u3);
	}

	public static void customerInit() {
		customers = new ArrayList<>();
		Customer c1 = new Customer(1, "张三", "广告", "互联网", 1, "021-21557876");
		Customer c2 = new Customer(1, "李四", "广告", "互联网", 1, "021-21557876");
		Customer c3 = new Customer(1, "王五", "广告", "互联网", 1, "021-21557876");
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
	}

	public static void linkmanInit() {
		linkMans = new ArrayList<>();
		LinkMan lm1 = new LinkMan("张三联系人", "男", "021-21557876", "上海", "无");
		LinkMan lm2 = new LinkMan("李四联系人", "男", "021-21557876", "上海", "无");
		LinkMan lm3 = new LinkMan("王五联系人", "男", "021-21557876", "上海", "无");
		linkMans.add(lm1);
		linkMans.add(lm2);
		linkMans.add(lm3);
	}
}
