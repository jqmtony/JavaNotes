/**
 * 
 */
package com.hwua.demo01;

import java.io.File;

/**
 * @author Administrator
 *
 */
public class Demo04 {
	public static void main(String[] args) {
		System.out.println("\n");
		System.out.println("\t");
		//-- �����е������� \ ����ת���ַ�.
		File file = new File("E:\\TC35\\A\\B\\C\\D.txt");
		System.out.println(file.delete());
		//-- ��֤�ļ�ɾ���ɹ�����ʧ��!
		System.out.println(file.exists());
		
	}

}
