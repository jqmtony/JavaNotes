package com.hwua.demo01;

import java.io.IOException;
import java.util.Properties;


public final class BeanFactory {
	
	public static void main(String[] args) {
		//-- 创建一个独立的Properties对象
		Properties pro = new Properties();
		//-- 给Properties对象加载配置文件
		try {
			pro.load(Demo01.class.getClassLoader().
					getResourceAsStream("config/config.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//-- 根据键读取值 读出来的都是String类型. 
		String value = pro.getProperty("type");
		//-- 输出
		System.out.println(value);
		Animal a = createInstance(value);
		a.showStyle();
		
	}
	/**
	 * 通过一个方法.来创建各种对象
	 * 该方法就是对应工厂可以生产加工的行为
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









