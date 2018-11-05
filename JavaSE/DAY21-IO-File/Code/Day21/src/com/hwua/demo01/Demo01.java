/**
 * 
 */
package com.hwua.demo01;

import java.io.File;

/**
 * @author Administrator
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		//-- 用File指向文件
		File file1 = new File("E:\\TC35\\hotlist.txt");
		File file2 = new File("E:\\TC35","hotlist.txt");
		 
		//-- 用File指向文件夹
		File directory1 = new File("E:\\TC35\\A");
		//-- B 在TC35目录下是没有的.
		File directory2 = new File("E:\\TC35\\B");
		
		//-- 验证文件或文件夹是否存在.在本地磁盘上确实有这个文件或文件夹存在.
		System.out.println(file1.exists());
		System.out.println(file2.exists());
		System.out.println(directory1.exists());
		//-- 如果没有返回值为false
		System.out.println(directory2.exists());
		
		//-- 获取文件或文件夹的名称
		System.out.println(file1.getName());
		
		//-- 获取文件或文件夹的路径
		System.out.println(file1.getPath());
		//-- 获取文件或文件夹的绝对路径
		System.out.println(file1.getAbsolutePath());
		//-- 获取文件或文件夹的上级目录
		File parentFile = file1.getParentFile();
		System.out.println(parentFile.getPath());
		
		//-- 获取文件的大小 单位是字节
		System.out.println(file1.length());
		
		//-- 获取空间大小.获取的是文件所在的盘符的总空间大小和剩余空间大小
		System.out.println(file1.getTotalSpace());
		System.out.println(file1.getFreeSpace());
	}
}
