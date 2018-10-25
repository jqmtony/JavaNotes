package com.hwua.demo01;

import java.io.IOException;
import java.util.Properties;

/**
 * 
 *  目的读取config.properties配置文件中内容
 * @author Administrator
 *
 */
public class Demo01 {
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
		String value = pro.getProperty("name");
		//-- 输出
		System.out.println(value);	
	}

}
