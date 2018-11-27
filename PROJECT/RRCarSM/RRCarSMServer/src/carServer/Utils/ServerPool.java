package carServer.Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import carServer.Manager.ServiceManager;

public class ServerPool {
	/**
	 * 提供线程池用来管理客户端的连接线程.避免每次新建线程所造成的系统资源浪费
	 */
	private ExecutorService threadPool;
	private ServerSocket serverSocket;
	private Socket socket;
	public ServerPool() {
		threadPool = Executors.newFixedThreadPool(30);
	}

	/**
	 * 服务端启动
	 */
	public void start() {
		System.out.println("等待客户端连接....");
		try {
			// -- 死循环等待多个客户端连接
			serverSocket = new ServerSocket(2222);
			while (true) {
				socket = serverSocket.accept();
				System.out.println("用户:\t" + socket.getInetAddress() + "\t连接成功");
				Runnable run = new ServerClient(socket);
				threadPool.execute(run);
			}
		} catch (IOException e) {
		}
	}

	/**
	 * `和客户端的线程通信内部类
	 * 
	 * @author Administrator
	 *
	 */
	class ServerClient implements Runnable {
		/**
		 * 当前客户端的连接
		 */
		private Socket socket;
		/**
		 * 当前客户端的服务
		 */
		private ServiceManager serviceFactory;

		/**
		 * 用来运行当前客户端服务的线程
		 * @param socket
		 */
		public ServerClient(Socket socket) {
			this.socket = socket;
			serviceFactory = new ServiceManager();
			System.out.println("this.socket = socket"+socket);
		}
		/**
		 * 与客户端的交互全部
		 */
		@Override
		public void run() {
			try {
				while(true) {
					  //接收客户端返回的字符串
			        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			        //将返回的字符串包装传递给服务工厂,调用业务dao包,然后返回生成的字符串结果
			        String request = new String(new StringBuffer(bufferedReader.readLine()));
			        System.out.println(" String request\t"+request);
					String response = serviceFactory.getService(request);
			        
			        // 将返回的字符串传回客户端
			        PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
			        System.out.println("服务端打印待返回的内容"+response);
			        printWriter.println(response);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
