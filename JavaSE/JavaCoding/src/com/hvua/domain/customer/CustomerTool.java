package com.hvua.domain.customer;

import java.util.Calendar;
import java.util.Random;

public class CustomerTool {

	// 创建客户编码生成方法
	public static String creatCustomerID() {
		// 获取时间，格式如201802
		Calendar calendar = Calendar.getInstance();
		int month = calendar.get(Calendar.MONTH)+1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		
		// 四位随机数
		Random random = new Random();
		int last4d = random.nextInt(9000) + 1000; // 随机生成4位数
		String custID = "KH";
		// 获取月
		if(month<10) {
			custID = custID + "0"+month;
		}else {
			custID = custID + month;
		}
		// 获取日
		if(day<10) {
			custID=custID+"0"+day;
		}else {
			custID = custID+day;
		}
		// 创建ID
		custID=custID+last4d;
		return custID;
	}
}
