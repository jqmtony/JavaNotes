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
		//-- 1.创建文件
		
		//-- 1.1 构建指向要创建的文件的File对象.
		File parentFile = new File("E:\\TC35\\A");
		File childFile = new File(parentFile,"A.txt");
		
		//-- 1.2 利用API方法来新建文件
		try {
			childFile.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//-- 2.创建文件.如果文件的上级目录中有不存在的文件夹怎么办
		//-- 2.1 构建File对象
		File file = new File("E:\\TC35\\A\\B\\C\\C.txt");
		//-- 2.2 怀疑上级目录中不存在.所以要验证下
		File file1 = file.getParentFile();
		//-- 2.3 验证是否存在
		if(!file1.exists()) {
			/*
			 * mkdirs和mkdir都是用来建立文件夹的区别在于
			 * mkdir  只能建立一层文件夹.如果层级关系中有不存在的会创建失败!
			 * mkdirs 无论你有多少层.无论是存在还是不存在.都可以创建
			 */
			//-- 2.4 当路径不存在时,把路径创建完成
			file1.mkdirs();
		}
		
		//-- 2.5.构建文件
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
