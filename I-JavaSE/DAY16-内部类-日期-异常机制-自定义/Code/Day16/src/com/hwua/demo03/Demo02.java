package com.hwua.demo03;

import java.util.Calendar;
import java.util.Locale;

public class Demo02 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance(Locale.CHINA);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		//-- 剩下的小时.分钟.秒.天都是一样的
		//-- 需要注意月取值0-11
	}
}
