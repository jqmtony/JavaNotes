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
		//-- 在所有的语言中 \ 代表转移字符.
		File file = new File("E:\\TC35\\A\\B\\C\\D.txt");
		System.out.println(file.delete());
		//-- 验证文件删除成功还是失败!
		System.out.println(file.exists());
		
	}

}
