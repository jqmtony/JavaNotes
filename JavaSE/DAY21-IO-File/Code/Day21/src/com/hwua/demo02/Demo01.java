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
public class Demo01 {

	public static void main(String[] args) {
		//-- 1.构建File
		File file = new File("E:\\TC35\\A\\B\\B.txt");		
		try {
			//-- 2.利用File构建流对象 凡是带有Stream结尾的都是字节流
			InputStream is = new FileInputStream(file);
			//-- 3.利用API方法来读取
			//-- 3.1 提供一个字节数组
			byte[] buffer = new byte[1024];
			//-- 3.2 把内容读取到字节数组中
			is.read(buffer);
			//-- 3.3 把读取到的内容转换成字符串并打印.为了保证不会乱码.要指定编码格式
			System.out.println(new String(buffer,"GBK"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
