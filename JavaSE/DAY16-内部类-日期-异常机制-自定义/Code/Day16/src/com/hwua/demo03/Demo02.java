package com.hwua.demo03;

import java.util.Calendar;
import java.util.Locale;

public class Demo02 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance(Locale.CHINA);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		//-- ʣ�µ�Сʱ.����.��.�춼��һ����
		//-- ��Ҫע����ȡֵ0-11
	}
}
