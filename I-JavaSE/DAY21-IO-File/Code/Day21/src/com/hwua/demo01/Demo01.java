/**
 * 
 */
package com.hwua.demo01;

import java.io.File;

/**
 * @author Administrator
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		//-- ��Fileָ���ļ�
		File file1 = new File("E:\\TC35\\hotlist.txt");
		File file2 = new File("E:\\TC35","hotlist.txt");
		 
		//-- ��Fileָ���ļ���
		File directory1 = new File("E:\\TC35\\A");
		//-- B ��TC35Ŀ¼����û�е�.
		File directory2 = new File("E:\\TC35\\B");
		
		//-- ��֤�ļ����ļ����Ƿ����.�ڱ��ش�����ȷʵ������ļ����ļ��д���.
		System.out.println(file1.exists());
		System.out.println(file2.exists());
		System.out.println(directory1.exists());
		//-- ���û�з���ֵΪfalse
		System.out.println(directory2.exists());
		
		//-- ��ȡ�ļ����ļ��е�����
		System.out.println(file1.getName());
		
		//-- ��ȡ�ļ����ļ��е�·��
		System.out.println(file1.getPath());
		//-- ��ȡ�ļ����ļ��еľ���·��
		System.out.println(file1.getAbsolutePath());
		//-- ��ȡ�ļ����ļ��е��ϼ�Ŀ¼
		File parentFile = file1.getParentFile();
		System.out.println(parentFile.getPath());
		
		//-- ��ȡ�ļ��Ĵ�С ��λ���ֽ�
		System.out.println(file1.length());
		
		//-- ��ȡ�ռ��С.��ȡ�����ļ����ڵ��̷����ܿռ��С��ʣ��ռ��С
		System.out.println(file1.getTotalSpace());
		System.out.println(file1.getFreeSpace());
	}
}
