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
			throw new IllegalArgumentException("·���Ƿ�");
		}

		// -- ���ò�������File����
		File file = new File(path);
		// -- ��ȡ����Ŀ¼��֤����Ŀ¼�Ƿ����
		File parentFile = file.getParentFile();
		// -- ��֤
		if (!parentFile.exists()) {
			parentFile.mkdirs();
		}
		file.createNewFile();
		return file;
	}

	/**
	 * 
	 * @param file    Ҫд����ļ�
	 * @param content Ҫд�������
	 */
	public void writeIntoFile(File file, String content) {
		if (file == null || content == null || content.length() == 0) {
			throw new IllegalArgumentException();
		}

		// -- 1.����������
		OutputStream os = null;

		try {
			try {
				// -- 2.ʵ����������
				os = new FileOutputStream(file, false);
				// -- 3.д�ļ�
				os.write(content.getBytes());
				// -- 4.ˢ��
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
	 * �ṩҪ����ȡ���ļ�
	 * 
	 * @param file
	 * @return �ļ������ݵ�ƴ��
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
					// -- �����ļ���������������
					is = new FileInputStream(files[i]);
					// -- ��������ȡ�ļ�
					while (-1 != (length = is.read(buffer))) {
						sb.append(new String(buffer, 0, length, "GBK"));
					}
					// -- �Ѷ�ȡ������ƴ�ӵ�line��
					line = line + sb.toString();
					// -- ���StringBuilder�� ����ڶ��ε����ݰ�����һ�ε�����
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
