package com.hwua.demo01;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * 实现多线程断点下载!
 */
public class Demo03 {
	public static void main(String[] args) {

		String path = "https://sm.myapp.com/original/im/WeChatSetup-2.6.4.47.exe";
		try {
			/*
			 * path:要请求的资源地址 
			 *  线程本身也是要消耗资源的.所以不要用太多的线程.
			 * threadCount: 要使用几个线程来下载
			 */
			method(path, 3);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param path        要请求的资源地址
	 * @param threadCount 要使用的下载线程数
	 */
	public static void method(String path, int threadCount) throws IOException {
		// -- 1.构建URL对象
		URL url = new URL(path);
		// -- 2.通过URL获取Connection
		URLConnection conn = url.openConnection();
		// -- 3.获取资源的大小..Connection是没有获取资源大小的APi转成HttpURLConnection.
		// long length = conn.getContentLengthLong();
		// -- 4.把URLConnection转换成HttpURLConnection.因为HttpURLConnection是针对HTTP的.有额外的方法
		HttpURLConnection httpConn = (HttpURLConnection) conn;
		// -- 5.设置请求参数:Get和Post Get是默认的.GET要全大写.POST也一样
		httpConn.setRequestMethod("GET");
		// -- 6.设置连接超时时间
		httpConn.setConnectTimeout(50000);
		// -- 7.获取响应行中的状态码
		/*
		 * http的请求和响应都可以分为3个部分 
		 * 请求行(请求方式,请求地址和请求协议) 
		 * 请求头(参数) 
		 * 请求体(请求的参数.指我们提交的用户名和密码等参数)
		 * 
		 * 响应行(响应码和响应状态)
		 *  响应头(参数) 
		 *  响应体(要显示的内容)
		 */
		int responseCode = httpConn.getResponseCode();
		// -- 8.对状态码进行验证
		if (responseCode != 200) {// - 404 500 505 300
			System.out.println("请求失败!");
			return;
		}
		// -- 9.获取所请求资源的大小 是文件的字节数
		int length = httpConn.getContentLength();
		// -- 10.构建随机存储文件 直接给文件名称就可以.会自动帮我们创建文件
		RandomAccessFile raf = new RandomAccessFile("E:\\" + getFileName(path), "rw");
		// -- 11.给RandomAccessFile 设置大小
		raf.setLength(length);
		// -- 12.按照线程数来设置每个线程要下载的文件大小(需要考虑不能整除的部分吗?)
		// -- 多线程下载需要把一个文件拆分成多份,由不同的线程来下载不同部分,最后再整合.
		int blockSize = length / threadCount;
		// -- 13.设置每个线程下载的起始位置和结束位置
		for (int i = 0; i < threadCount; i++) {
			// -- 设置起始位置
			int startIndex = i * blockSize;
			// -- 设置结束位置.-1的目的是保证第一个线程的结束位置不和下一个线程的起始位置重叠
			int endIndex = (i + 1) * blockSize - 1;
			// -- 如果是最后一个线程设置它的结束位置
			if (threadCount == i) {
				// -- 保证文件的完整.解决除以线程个数有余数的情况.
				endIndex = length;
			}
			// -- 把两个位置传入线程中,让线程去执行.
			WorkThread wt = new WorkThread(i, startIndex, endIndex, path);
			// -- 启动工作线程来下载对应的部分资源.
			wt.start();
		}
	}

	/**
	 * @param path 请求的资源地址
	 * @return 从资源地址中截取资源的名称
	 */
	public static String getFileName(String path) {
		//-- 这样写是比较稳妥的
		File file = new File(path);
		file.getName();
		
		//-- 这种写法有风险.
		return path.substring(path.lastIndexOf("/") + 1);
	}

	private static class WorkThread extends Thread {
		private int i;
		private long startIndex;
		private long endIndex;
		private String path;

		/**
		 * @param i          代表第几号线程
		 * @param startIndex 该线程下载内容的起始位置
		 * @param endIndex   该线程下载内容的结束位置
		 * @param path       请求的资源地址
		 */
		public WorkThread(int i, long startIndex, long endIndex, String path) {
			this.i = i;
			this.startIndex = startIndex;
			this.endIndex = endIndex;
			this.path = path;
		}

		@Override
		public void run() {
			try {
				URL url = new URL(path);
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setRequestMethod("GET");
				conn.setConnectTimeout(50000);
				/*
				 * 用于在文件中写入当前线程下载到哪里了 断点续传.
				 */
				File file = new File("E:\\" + i + ".txt");
				/*
				 * 验证文件是否存在.目的是断点续传. 如果文件存在.代表之前已经下载过了.那该线程已经从已经下载的位置继续 向后下载. 通过该方式来实现断点续传
				 */
				if (file.exists() && file.length() > 0) {
					// -- 根据文件建立流.读取最后一个字符的位置来作为新的开始位置
					BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
					String line = br.readLine();
					if (line != null && line.length() > 0) {
						// -- 获取新的起始位置.
						startIndex = Integer.parseInt(line);
					}
				}
				// -- 如果文件是不存在的.在代表新开始.从预先设定的start开始
				// -- 首先设置请求的不再是整个文件,而是部分文件
				conn.setRequestProperty("Range", "bytes=" + startIndex + "-" + endIndex);

				// -- 建立存储下载文件的随机存储文件
				RandomAccessFile raf = new RandomAccessFile("E:\\" + getFileName(path), "rw");
				// -- 设置开始位置
				raf.seek(startIndex);
				System.out.println("线程" + i + ":" + startIndex + "~~" + endIndex);
				// -- 重新获取指定的部分资源
				InputStream is = conn.getInputStream();
				System.out.println("ResponseCode:\t" + conn.getResponseCode());
				byte[] buffer = new byte[1024];
				// -- 用于记录当前已经读取的字节数
				int length = 0;
				// -- 用于更新每次下载后的新的起始位置.
				int newIndex = 0;
				while ((length = is.read(buffer)) != -1) {
					RandomAccessFile rr = new RandomAccessFile(file, "rw");// 存储下载标记的文件
					raf.write(buffer, 0, length);
					// 将下载标记存入指定文档
					String savaPoint = String.valueOf(newIndex += length);
					rr.write(savaPoint.getBytes());
					rr.close();
				}
				is.close();
				raf.close();
				System.out.println("i部分下载成功!");
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
