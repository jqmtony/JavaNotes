package D19_CustomerContactsUser.Util;

import java.util.ArrayList;

import D19_CustomerContactsUser.Bean.Customer;
import D19_CustomerContactsUser.Bean.LinkMan;
import D19_CustomerContactsUser.Bean.User;

public class DataSet {
	// �Զ����ID��ID��Ψһ��
	private static int userID = 1;
	private static int customerID = 1;
	private static int linkmanID = 1;
	// ʹ��ArrayList�������
	public static ArrayList<Customer> customers;
	public static ArrayList<LinkMan> linkMans;
	public static ArrayList<User> users;

	// ����ID
	public static int getLastUserID() {
		return userID++;
	}

	public static int getLastCustomerID() {
		return customerID++;
	}

	public static int getLastLinkManID() {
		return linkmanID++;
	}

	// ��ʼ��
	static {
		userInit();
		customerInit();
		linkmanInit();
	}

	public static void userInit() {
		users = new ArrayList<>();
		User u1 = new User(1, "����", "����", "123");
		User u2 = new User(1, "����", "����", "123");
		User u3 = new User(1, "����", "����", "123");
		users.add(u1);
		users.add(u2);
		users.add(u3);
	}

	public static void customerInit() {
		customers = new ArrayList<>();
		Customer c1 = new Customer(1, "����", "���", "������", 1, "021-21557876");
		Customer c2 = new Customer(1, "����", "���", "������", 1, "021-21557876");
		Customer c3 = new Customer(1, "����", "���", "������", 1, "021-21557876");
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
	}

	public static void linkmanInit() {
		linkMans = new ArrayList<>();
		LinkMan lm1 = new LinkMan("������ϵ��", "��", "021-21557876", "�Ϻ�", "��");
		LinkMan lm2 = new LinkMan("������ϵ��", "��", "021-21557876", "�Ϻ�", "��");
		LinkMan lm3 = new LinkMan("������ϵ��", "��", "021-21557876", "�Ϻ�", "��");
		linkMans.add(lm1);
		linkMans.add(lm2);
		linkMans.add(lm3);
	}
}
