/**
 * 
 */
package com.hwua.demo03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * @author Administrator
 *
 */
public class ChatServer {

	/**
	 * 提供Server
	 */
	private ServerSocket serverSocket;

	/**
	 * 提供线程池用来管理客户端的连接线程.避免每次新建线程所造成的系统资源浪费
	 */
	private ExecutorService threadPool;

	/**
	 * 提供集合保存每一个客户的姓名和与之对应的输出流对象.
	 */
	private Map<String, PrintWriter> allOut;

	/**
	 * 实例化ServerSocket
	 * 
	 * @param port 端口号 理论上端口号应该是读取配置文件获取的.
	 */
	public ChatServer(int port) {
		try {
			serverSocket = new ServerSocket(port);
			allOut = new HashMap<>();
			threadPool = Executors.newFixedThreadPool(10);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 把用户名和对应的PrintWriter添加到容器中
	 * 
	 * @param key   用户名
	 * @param value 该用户所对应的输出流对象
	 */
	public void addOut(String key, PrintWriter value) {
		// -- 保证不会遇到同名.避免同时插入的key是相同的.
		synchronized (this) {
			allOut.put(key, value);
		}
	}

	/**
	 * 从集合中移除已经下线的客户
	 * 
	 * @param key 用户名
	 */
	public synchronized void removeOut(String key) {
		allOut.remove(key);
		System.out.println("当前在线人数:\t" + allOut.size());
	}

	/**
	 * 向所有人发消息
	 * 
	 * @param msg
	 */
	public synchronized void sendMsgToAll(String msg) {
		for (PrintWriter out : allOut.values()) {
			out.println(msg);
			System.out.println("当前在线人数:\t" + allOut.size());
		}
	}

	/**
	 * 把消息发送给指定的人
	 * 
	 * @param nickName
	 * @param msg
	 */
	public synchronized void sendMsgToPrivate(String key, String msg) {
		PrintWriter pw = allOut.get(key);
		if (pw != null) {
			pw.println(msg);
			System.out.println("当前在线人数:\t" + allOut.size());
		}
	}

	/**
	 * 服务端启动
	 */
	public void start() {
		try {
			// -- 死循环等待多个客户端连接
			while (true) {
				System.out.println("等待客户端连接....");
				Socket socket = serverSocket.accept();
				System.out.println("客户:\t" + socket.getInetAddress() + "\t连接成功");
				Runnable run = new GetClientMsgHandler(socket);
				threadPool.execute(run);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 和某个客户端的所有通信都是在子线程内部完成的. 线程本身是没有Socket的.所以需要从外面把Socket传递到 线程内部.最方便的方式就是有参构造了
	 * 
	 * @author Administrator
	 *
	 */
	class GetClientMsgHandler implements Runnable {

		private Socket socket;
		// -- 代表这个客户端的用户名
		private String nickName;

		/**
		 * @param socket
		 */
		public GetClientMsgHandler(Socket socket) {
			this.socket = socket;
		}

		public String getNickName() {
			try {
				// -- 通过Socket获取输入字节流
				InputStream is = socket.getInputStream();
				// -- 利用转换流把字节流转换成字符流
				InputStreamReader isr = new InputStreamReader(is, "GBK");
				// -- 利用装饰把字符流装饰层缓冲流
				BufferedReader br = new BufferedReader(isr);

				// -- 获取输出流
				OutputStream os = socket.getOutputStream();
				// -- 对输出流进行包装得到打印流
				PrintWriter pw = new PrintWriter(os, true);

				// -- 读取客户端发送过来的昵称
				String name = br.readLine();
				// -- 验证用户名是否OK
				while (true) {
					if (name.trim().length() == 0) {
						pw.println("FAIL");
					}
					if (allOut.containsKey(name)) {
						pw.println("FAIL");
					} else {
						pw.println("OK");
						return name;
					}
					// -- 再读.直到名字OK为止.
					name = br.readLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			return nickName;
		}

		@Override
		public void run() {
			try {
				// -- 局部变量要做初始化
				PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
				// -- 获取用户名
				nickName = getNickName();
				addOut(nickName, pw);
				Thread.sleep(100);
				sendMsgToAll("[系统通知:] 欢迎" + nickName + "来到聊天室!");

				// -- 准备收消息
				InputStream is = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(is, "GBK");
				BufferedReader br = new BufferedReader(isr);
				String msgString = "";

				// -- 利用循环重复接收消息
				while (null != (msgString = br.readLine())) {
					// -- 验证是否为私聊
					if (msgString.startsWith("@")) {
						int index = msgString.indexOf(":");
						if (index >= 0) {
							// -- 获取昵称
							String name = msgString.substring(1, index);
							// -- 获取发送的内容
							String info = msgString.substring(index + 1, msgString.length());
							// -- 拼接一句话
							info = nickName + "对你说:\t" + info;
							// -- 调用私聊方法
							sendMsgToPrivate(name, info);
							// -- 结束当前私聊状态
							continue;
						}
					}
					// -- 不是私聊.就是发送消息给所有人
					sendMsgToAll(nickName + "所" + msgString);
				}

			} catch (IOException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				removeOut(nickName);
				sendMsgToAll("[系统通知]:\t" + nickName + "已经下线!");
				// -- 既然下线了就关闭socket
				if (socket != null) {
					try {
						socket.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

	}

	/**
	 * 服务端入口程序
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ChatServer server = new ChatServer(1234);
		server.start();
	}

}
