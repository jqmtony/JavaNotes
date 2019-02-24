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
public class Demo04 {

	public static void main(String[] args) {
		// -- 1.构建File
		File file = new File("E:\\TC35\\A\\B\\B.txt");
		InputStream is = null;
		try {
			try {
				// -- 2.利用File构建流对象 凡是带有Stream结尾的都是字节流
				is = new FileInputStream(file);
				// -- 3.利用API方法来读取
				// -- 3.1 提供一个字节数组
				byte[] buffer = new byte[1024];
				// -- read方法有返回值.如果是-1代表读取到文件末尾.利用该值构建循环条件
				// -- 不确定循环次数时,最好的选择就是while
				// -- 3.2 为了解决数组默认值和读取内容长度不足数组长度问题
				// -- 保存每次实际读取的长度
				int length = 0;
				// -- 3.3 提供一个可变长度的容器用来保存每次读取的内容
				StringBuilder sb = new StringBuilder();
				// -- 3.4 把内容读取到数组中并获取当前读取的字节数来作为循环条件
				while (-1 != (length = is.read(buffer))) {
					// -- 3.5 把读取的内容转变成字符串
					String str = new String(buffer, 0, length, "GBK");
					// -- 3.6 如果读取了多次.第二次是否把第一次的该覆盖了
					// -- 把当前读取的给保存下来
					sb.append(str);
				}
				// -- 3.7 把读取到的内容转换成字符串并打印.为了保证不会乱码.要指定编码格式
				System.out.println(sb.toString());
				// -- 3.8 关闭流
			} finally {
				is.close();
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
