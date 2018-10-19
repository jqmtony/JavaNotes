package com.hwua.customer;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;

public class CustomerTest {
	public static void main(String[] args) {
		CustomerTest ct = new CustomerTest();

		Customer c1 = new Customer();
		c1.setCustomerID(ct.createCustomerID());
		c1.setCustomerName("张三");
		
		Customer c2 = new Customer();
		c2.setCustomerID(ct.createCustomerID());
		c2.setCustomerName("李四");
		
		Customer c3 = new Customer();
		c3.setCustomerID(ct.createCustomerID());
		c3.setCustomerName("王五");
		
		Customer c4 = new Customer();
		c4.setCustomerID(ct.createCustomerID());
		c4.setCustomerName("赵六");
		
		Customer[] array = new Customer[10];
		//-- 引用类型的默认值都是null
		System.out.println(Arrays.toString(array));
		
		array[0] = c1;
		array[1] = c2;
		array[2] = c3;
		array[3] = c4;
		
		//-- 对数组中的元素进行遍历
		for (Customer cu : array) {
			System.out.println(cu);
		}

	}

	/**
	 * 产生客户编号 KH + 月日 + 四位随机数 UUID等方式来实现.
	 * 
	 * @return
	 */
	public String createCustomerID() {
		// -- Java提供了Calendar类来代表日历.一般获取时间都通过它
		Calendar cal = Calendar.getInstance();

		// -- 获取月 取值0-11
		int month = cal.get(Calendar.MONTH) + 1;
		// -- 获取你
		int day = cal.get(Calendar.DAY_OF_MONTH);

		// -- 获取四位随机数
		Random random = new Random();
		int ran = random.nextInt(9000) + 1000;

		String custID = "KH";
		
		if (month < 10) {
			custID = custID + "0" + month;
		} else {
			custID = custID + month;
		}
		
		if (day < 10) {
			custID = custID + "0" + day;
		} else {
			custID = custID + day;
		}

		custID = custID + ran;

		return custID;

	}
}
