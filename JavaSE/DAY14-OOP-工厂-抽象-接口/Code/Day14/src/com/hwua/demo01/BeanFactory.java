package com.hwua.demo01;

import java.io.IOException;
import java.util.Properties;


public final class BeanFactory {
	
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
		String value = pro.getProperty("type");
		//-- ���
		System.out.println(value);
		Animal a = createInstance(value);
		a.showStyle();
		
	}
	/**
	 * ͨ��һ������.���������ֶ���
	 * �÷������Ƕ�Ӧ�������������ӹ�����Ϊ
	 */
	public final static Animal createInstance(String type) {
		Animal a =null;	
		switch (type) {
		case "dog":
			a = new Dog();
			break;
		case "cat":
			a = new Cat();
			break;
		case "rabbit":
			a = new Rabbit();
			break;
		default:
			a = new Animal();
			break;
		}
		return a;
	}

}









