/**
 * 
 */
package com.hwua.demo01;

import java.io.File;

/**
 * @author Administrator
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		System.out.println("\n");
		System.out.println("\t");
		//-- �����е������� \ ����ת���ַ�.
		File file = new File("E:\\TC35\\A\\B\\C\\C.txt");
		//-- ��������ļ�����������.���target����Ҫʵ�ʴ���.ֻҪ·��׼ȷ�Ϳ�����
		File target = new File("E:\\TC35\\A\\B\\B.txt");
		System.out.println(file.renameTo(target));
		
	}

}
