package com.hwua.tools;

import java.util.UUID;

public class IdTools {
	
	public static String getUUID() {
		//-- 1.����UUID
		String str = UUID.randomUUID().toString();
		//-- 2.ȥ���ַ������еĺ���
		str = str.replaceAll("-", "");
		//-- 3Сдת��д
		str = str.toUpperCase();
		return str;
	}
	
	public static String getUUID64() {
		return getUUID() + getUUID();				
	}
	
	
	
	
	
	

}
