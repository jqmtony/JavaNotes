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
		//-- 在所有的语言中 \ 代表转移字符.
		File file = new File("E:\\TC35\\A\\B\\C\\C.txt");
		//-- 对上面的文件进行重命名.这个target不需要实际存在.只要路径准确就可以了
		File target = new File("E:\\TC35\\A\\B\\B.txt");
		System.out.println(file.renameTo(target));
		
	}

}
