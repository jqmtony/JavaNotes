/**
 * 
 */
package com.hwua.demo01;

import java.io.File;
import java.io.IOException;

/**
 * @author Administrator
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		//-- 1.�����ļ�
		
		//-- 1.1 ����ָ��Ҫ�������ļ���File����.
		File parentFile = new File("E:\\TC35\\A");
		File childFile = new File(parentFile,"A.txt");
		
		//-- 1.2 ����API�������½��ļ�
		try {
			childFile.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//-- 2.�����ļ�.����ļ����ϼ�Ŀ¼���в����ڵ��ļ�����ô��
		//-- 2.1 ����File����
		File file = new File("E:\\TC35\\A\\B\\C\\C.txt");
		//-- 2.2 �����ϼ�Ŀ¼�в�����.����Ҫ��֤��
		File file1 = file.getParentFile();
		//-- 2.3 ��֤�Ƿ����
		if(!file1.exists()) {
			/*
			 * mkdirs��mkdir�������������ļ��е���������
			 * mkdir  ֻ�ܽ���һ���ļ���.����㼶��ϵ���в����ڵĻᴴ��ʧ��!
			 * mkdirs �������ж��ٲ�.�����Ǵ��ڻ��ǲ�����.�����Դ���
			 */
			//-- 2.4 ��·��������ʱ,��·���������
			file1.mkdirs();
		}
		
		//-- 2.5.�����ļ�
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
