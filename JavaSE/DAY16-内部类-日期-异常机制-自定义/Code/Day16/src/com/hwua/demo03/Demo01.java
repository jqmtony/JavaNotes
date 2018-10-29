package com.hwua.demo03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		System.out.println(System.currentTimeMillis());
		System.out.println(date.getTime());
		System.out.println(date.getDate());
		System.out.println(date.getDay());
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getMonth());
		System.out.println(date.getSeconds());
		System.out.println(date.getTimezoneOffset());
		System.out.println(date.getYear());
		
		System.out.println("-----------格式化时间--------------");
		
		//-- 构造时指明格式
		SimpleDateFormat formart = new SimpleDateFormat("MM月 yyyy年 dd日"
				+ "-HH时:mm分:ss秒");
		String str = formart.format(date);
		System.out.println(str);
	}
}
