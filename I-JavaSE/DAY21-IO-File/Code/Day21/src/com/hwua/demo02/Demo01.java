/**
 * 
 */
package com.hwua.demo02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Administrator
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		//-- 1.����File
		File file = new File("E:\\TC35\\A\\B\\B.txt");		
		try {
			//-- 2.����File���������� ���Ǵ���Stream��β�Ķ����ֽ���
			InputStream is = new FileInputStream(file);
			//-- 3.����API��������ȡ
			//-- 3.1 �ṩһ���ֽ�����
			byte[] buffer = new byte[1024];
			//-- 3.2 �����ݶ�ȡ���ֽ�������
			is.read(buffer);
			//-- 3.3 �Ѷ�ȡ��������ת�����ַ�������ӡ.Ϊ�˱�֤��������.Ҫָ�������ʽ
			System.out.println(new String(buffer,"GBK"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
