/**
 * 
 */
package com.hwua.demo02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author Administrator
 *
 */
public class Demo07 {
	/**
	 * 
	 */
	private static final int BUFFER_MAX_SIZE = 1024;

	public static void main(String[] args) {
		Demo07 d = new Demo07();
		File fileC = null;
		File fileD = null;
		File fileE = null;
		try {
			fileC = d.createFileOrDirectory("C:\\C\\C.txt");
			fileD = d.createFileOrDirectory("D:\\D\\D.txt");
			fileE = d.createFileOrDirectory("E:\\E\\E.txt");

			d.writeIntoFile(fileC, "Hello");
			d.writeIntoFile(fileD, "World");

			String line = d.readFromFile(fileC, fileD);
			d.writeIntoFile(fileE, line);

		} catch (IllegalArgumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * 
	 * @param path
	 * @throws IOException
	 */
	public File createFileOrDirectory(String path) throws IllegalArgumentException, IOException {
		if (path == null || path.length() == 0) {
			throw new IllegalArgumentException("路径非法");
		}

		// -- 利用参数构建File对象
		File file = new File(path);
		// -- 获取父级目录验证父级目录是否存在
		File parentFile = file.getParentFile();
		// -- 验证
		if (!parentFile.exists()) {
			parentFile.mkdirs();
		}
		file.createNewFile();
		return file;
	}

	/**
	 * 
	 * @param file    要写入的文件
	 * @param content 要写入的内容
	 */
	public void writeIntoFile(File file, String content) {
		if (file == null || content == null || content.length() == 0) {
			throw new IllegalArgumentException();
		}

		// -- 1.构建流对象
		OutputStream os = null;

		try {
			try {
				// -- 2.实例化流对象
				os = new FileOutputStream(file, false);
				// -- 3.写文件
				os.write(content.getBytes());
				// -- 4.刷新
				os.flush();
			} finally {
				os.close();
				os = null;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * 提供要被读取的文件
	 * 
	 * @param file
	 * @return 文件中内容的拼接
	 */
	public String readFromFile(File... files) {
		String line = "";
		if (files == null || files.length == 0) {
			throw new IllegalArgumentException();
		}

		InputStream is = null;
		int length = 0;
		byte[] buffer = new byte[BUFFER_MAX_SIZE];
		StringBuilder sb = new StringBuilder();
		try {
			try {
				for (int i = 0; i < files.length; i++) {
					// -- 利用文件构建输入流对象
					is = new FileInputStream(files[i]);
					// -- 利用流读取文件
					while (-1 != (length = is.read(buffer))) {
						sb.append(new String(buffer, 0, length, "GBK"));
					}
					// -- 把读取的内容拼接到line上
					line = line + sb.toString();
					// -- 清空StringBuilder中 避免第二次的内容包含第一次的内容
					sb.delete(0, sb.length());
					sb.setLength(0);
				}
			} finally {
				is.close();
			}
		} catch (Exception e) {
		}
		return line;
	}

}
