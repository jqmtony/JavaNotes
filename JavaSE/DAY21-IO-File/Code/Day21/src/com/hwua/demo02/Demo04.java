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
public class Demo04 {

	public static void main(String[] args) {
		// -- 1.����File
		File file = new File("E:\\TC35\\A\\B\\B.txt");
		InputStream is = null;
		try {
			try {
				// -- 2.����File���������� ���Ǵ���Stream��β�Ķ����ֽ���
				is = new FileInputStream(file);
				// -- 3.����API��������ȡ
				// -- 3.1 �ṩһ���ֽ�����
				byte[] buffer = new byte[1024];
				// -- read�����з���ֵ.�����-1�����ȡ���ļ�ĩβ.���ø�ֵ����ѭ������
				// -- ��ȷ��ѭ������ʱ,��õ�ѡ�����while
				// -- 3.2 Ϊ�˽������Ĭ��ֵ�Ͷ�ȡ���ݳ��Ȳ������鳤������
				// -- ����ÿ��ʵ�ʶ�ȡ�ĳ���
				int length = 0;
				// -- 3.3 �ṩһ���ɱ䳤�ȵ�������������ÿ�ζ�ȡ������
				StringBuilder sb = new StringBuilder();
				// -- 3.4 �����ݶ�ȡ�������в���ȡ��ǰ��ȡ���ֽ�������Ϊѭ������
				while (-1 != (length = is.read(buffer))) {
					// -- 3.5 �Ѷ�ȡ������ת����ַ���
					String str = new String(buffer, 0, length, "GBK");
					// -- 3.6 �����ȡ�˶��.�ڶ����Ƿ�ѵ�һ�εĸø�����
					// -- �ѵ�ǰ��ȡ�ĸ���������
					sb.append(str);
				}
				// -- 3.7 �Ѷ�ȡ��������ת�����ַ�������ӡ.Ϊ�˱�֤��������.Ҫָ�������ʽ
				System.out.println(sb.toString());
				// -- 3.8 �ر���
			} finally {
				is.close();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
