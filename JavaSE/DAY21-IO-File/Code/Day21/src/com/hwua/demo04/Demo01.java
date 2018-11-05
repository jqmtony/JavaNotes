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
		// -- 找到首富祖奶奶
		File file = new File("data/我成了首富祖奶奶.txt");
		System.out.println(file.exists());
		// -- 读取文本一定是字符流
		// -- 只有读取图片媒体.等二进制内容时才用字节

		try {
			// -- 对字符进行包装 得到包装流/缓冲流
			BufferedReader br = new BufferedReader(
					// InputStreamReader是转换流把字节转成字符
					new InputStreamReader(new FileInputStream(file), "GBK"));

			String line = "";
			while (null != (line = br.readLine())) {
				// System.out.println(line);
				if (line.contains("第")&&line.contains("章")) {
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
