package com.hwua.demo03;

import java.io.IOException;

public class Demo03 {

	public static void main(String[] args) {
		//-- ��ȡ����ʱ
		Runtime time = Runtime.getRuntime();
		try {
			//-- �ṩ�ļ�·�����Դ�����һ���ļ�.(��ִ���ļ�)
			time.exec("C:\\Program Files\\Sublime Text 3\\sublime_text.exe");
			// �ᱨ����:������Ч�� Win32 Ӧ�ó���
			// time.exec("E:\\data1.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
