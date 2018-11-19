package carServer.Utils;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerPool {
	/**
	 * 提供线程池用来管理客户端的连接线程.避免每次新建线程所造成的系统资源浪费
	 */
	private ExecutorService threadPool;
	private ServerSocket serverSocket;
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
				Socket socket = serverSocket.accept();
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
		private ServiceFactory serviceFactory;

		/**
		 * 用来运行当前客户端服务的线程
		 * @param socket
		 */
		public ServerClient(Socket socket) {
			this.socket = socket;
		}
		/**
		 * 与客户端的交互全部
		 */
		@Override
		public void run() {
			try {
				if (ServiceSocket.getResponse(socket) != null) {
					try {
						ServiceSocket.getResponse(serviceFactory, socket);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					socket.close();
				} catch (IOException e) {
					System.out.println("用户:\t" + socket.getInetAddress() + "\t断开连接");
					e.printStackTrace();
				}
			}
		}
	}

}
