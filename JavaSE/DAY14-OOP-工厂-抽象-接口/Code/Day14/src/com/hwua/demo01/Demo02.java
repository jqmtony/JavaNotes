package com.hwua.demo01;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class Demo02 {

	public static void main(String[] args) {
		// -- ����һ��������Properties����
		Properties pro = new Properties();
		// -- ��Properties������������ļ�
		try {
			pro.load(Demo01.class.getClassLoader().getResourceAsStream("config.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// -- ���ݼ���ȡֵ �������Ķ���String����.
		String value = pro.getProperty("className");
		// -- ���
		System.out.println(value);
		// -- ���÷��乹������
		
		Animal a =  null;
		//-- �����������������,����ȥ���������
		try {
			Class c = Class.forName(value);
			//-- Class ����class. ��ȡc�����еĹ�����
			Constructor constructor = c.getConstructor();
			Object newInstance = constructor.newInstance();
			if (newInstance instanceof Animal) {
				a = (Animal) newInstance;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		a.setAge(1);
		a.setName("����");
		System.out.println(a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
