/**
 * 
 */
package com.hwua.demo02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author Administrator
 *
 */
public class Demo05 {

	public static void main(String[] args) {
		//-- ˼����: �Ƿ�Ҫ�����ļ��ĸ���Ŀ¼�Ǳ������
		//-- 1.������
		OutputStream os = null;
		try {
			try {
				//-- 2.ʵ����������
				os = new FileOutputStream("E:\\TC35\\A\\B\\C\\C.txt");
				
				//-- 3.����API����д�ļ�
				os.write("ABC".getBytes());
				//-- 4.ˢ����.�����
				os.flush();
			}finally {
				os.close();
			}
		}catch (FileNotFoundException e) {
			// TODO: handle exception
		}catch (IOException e) {
			// TODO: handle exception
		}
	}
}
