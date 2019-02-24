/**
 * 
 */
package com.hwua.demo02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author Administrator
 *
 */
public class Demo05 {

	public static void main(String[] args) {
		//-- 思考下: 是否要保障文件的父级目录是必须存在
		//-- 1.声明流
		OutputStream os = null;
		try {
			try {
				//-- 2.实例化流对象
				os = new FileOutputStream("E:\\TC35\\A\\B\\C\\C.txt");
				
				//-- 3.利用API方法写文件
				os.write("ABC".getBytes());
				//-- 4.刷新流.必须的
				os.flush();
			}finally {
				os.close();
			}
		}catch (FileNotFoundException e) {
			// TODO: handle exception
		}catch (IOException e) {
			// TODO: handle exception
		}
	}
}
