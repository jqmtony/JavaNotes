package com.hwua.customer;

import java.util.Calendar;
import java.util.Random;

/**
 * 专门用于生成客户ID的工具类
 * @author Administrator
 *
 */
public class CustomerIDTools {
	/**
	 * 产生客户编号 KH + 月日 + 四位随机数 UUID等方式来实现.
	 * 
	 * @return
	 */
	public static String createCustomerID() {
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
