/**
 * 
 */
package com.hwua.demo04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * @author Administrator
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		// -- �ҵ��׸�������
		File file = new File("data/�ҳ����׸�������.txt");
		System.out.println(file.exists());
		// -- ��ȡ�ı�һ�����ַ���
		// -- ֻ�ж�ȡͼƬý��.�ȶ���������ʱ�����ֽ�

		try {
			// -- ���ַ����а�װ �õ���װ��/������
			BufferedReader br = new BufferedReader(
					// InputStreamReader��ת�������ֽ�ת���ַ�
					new InputStreamReader(new FileInputStream(file), "GBK"));

			String line = "";
			while (null != (line = br.readLine())) {
				// System.out.println(line);
				if (line.contains("��")&&line.contains("��")) {
					System.out.println(line);
				}
			}

		} catch (UnsupportedEncodingException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
