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
		// -- 1.构建File
		File file = new File("C:\\Users\\Administrator\\Documents\\GitHub\\JavaNotes\\JavaSE\\JavaCoding\\src\\D21_IO_Thread\\data\\我成了首富祖奶奶.txt");
		try {
			Reader reader = null;
			try {
				// -- 2.构建流
				reader = new FileReader(file);
				// -- 3.利用循环和API方法重复读取
				int length = 0;
				StringBuilder sb = new StringBuilder();
				char[] buffer = new char[1024];
				while (-1 != (length = reader.read(buffer))) {
					sb.append(new String(buffer, 0, length));
				}
				System.out.println(sb.toString());
			} finally {
				// -- 4.关闭流
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
