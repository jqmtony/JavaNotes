/**
 * 
 */
package com.hwua.demo03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;
import java.io.Reader;

/**
 * @author Administrator
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		// -- 1.����File
		File file = new File("C:\\Users\\Administrator\\Documents\\GitHub\\JavaNotes\\JavaSE\\JavaCoding\\src\\D21_IO_Thread\\data\\�ҳ����׸�������.txt");
		try {
			Reader reader = null;
			try {
				// -- 2.������
				reader = new FileReader(file);
				// -- 3.����ѭ����API�����ظ���ȡ
				int length = 0;
				StringBuilder sb = new StringBuilder();
				char[] buffer = new char[1024];
				while (-1 != (length = reader.read(buffer))) {
					sb.append(new String(buffer, 0, length));
				}
				System.out.println(sb.toString());
			} finally {
				// -- 4.�ر���
				reader.close();
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
