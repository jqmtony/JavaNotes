package com.hwua.demo01;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class Demo02 {

	public static void main(String[] args) {
		// -- 创建一个独立的Properties对象
		Properties pro = new Properties();
		// -- 给Properties对象加载配置文件
		try {
			pro.load(Demo01.class.getClassLoader().getResourceAsStream("config.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// -- 根据键读取值 读出来的都是String类型.
		String value = pro.getProperty("className");
		// -- 输出
		System.out.println(value);
		// -- 利用反射构建对象
		
		Animal a =  null;
		//-- 把类名告诉类加载器,让它去加载这个类
		try {
			Class c = Class.forName(value);
			//-- Class 不是class. 获取c对象中的构造器
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
		a.setName("旺财");
		System.out.println(a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
