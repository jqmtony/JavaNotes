/**
 * 
 */
package com.hwua.demo03;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @author Administrator
 *
 */
public class Demo02 {

	public static void main(String[] args) {

		try {
			Writer writer = new FileWriter("C:\\C\\C.txt", true);
			writer.write("�ַ���֧��ֱ��д�ַ���");
			// -- �ַ�����ˢ�»������ǲ��������д���ļ�
			writer.flush();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
