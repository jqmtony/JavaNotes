package com.hwua.tools;

import java.util.UUID;

public class IdTools {
	
	public static String getUUID() {
		//-- 1.生成UUID
		String str = UUID.randomUUID().toString();
		//-- 2.去掉字符串中中的横线
		str = str.replaceAll("-", "");
		//-- 3小写转大写
		str = str.toUpperCase();
		return str;
	}
	
	public static String getUUID64() {
		return getUUID() + getUUID();				
	}
	
	
	
	
	
	

}
