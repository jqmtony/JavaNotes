package com.hwua.demo01;

import java.io.IOException;
import java.util.Properties;

/**
 * 
 *  Ŀ�Ķ�ȡconfig.properties�����ļ�������
 * @author Administrator
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		//-- ����һ��������Properties����
		Properties pro = new Properties();
		//-- ��Properties������������ļ�
		try {
			pro.load(Demo01.class.getClassLoader().
					getResourceAsStream("config/config.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//-- ���ݼ���ȡֵ �������Ķ���String����. 
		String value = pro.getProperty("name");
		//-- ���
		System.out.println(value);	
	}

}
