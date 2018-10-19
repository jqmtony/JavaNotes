package com.hvua.domian.test;
import java.util.Calendar;
import java.util.Random;
import com.hvua.domain.Customer;

/*
 * 	2.	提供一个数组,数组中的元素类型是客户类型..
	a)	向数组中插入10条客户信息
	b)	遍历整个数组中所有客户的信息.
 */

public class CustomerTest {
	public static void main(String[] args) {
	
	}

	// 创建客户编码生成方法
	public String customerID() { // 不需要加static静态，通过对象调用
		Random random = new Random();
		int date = 201810;
		// TODO Java提供了Calendar类来代表日历，一般获取时间通过它
		Calendar cal = new Calendar;
		int month = cal.get
		int last4d = random.nextInt(9000)+1000; // 随机生成4位数
		String customerID = "KH"+date+last4d;
		return customerID; 
	}
}
