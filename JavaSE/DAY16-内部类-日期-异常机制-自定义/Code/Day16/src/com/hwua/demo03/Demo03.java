package com.hwua.demo03;

import java.io.IOException;

public class Demo03 {

	public static void main(String[] args) {
		//-- 获取运行时
		Runtime time = Runtime.getRuntime();
		try {
			//-- 提供文件路径可以打开任意一个文件.(可执行文件)
			time.exec("C:\\Program Files\\Sublime Text 3\\sublime_text.exe");
			// 会报错误:不是有效的 Win32 应用程序
			// time.exec("E:\\data1.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
