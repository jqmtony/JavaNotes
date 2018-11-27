package carServer.Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import carServer.Manager.ServiceManager;

/**
 * @author Administrator
 *
 */
public class threadPool {

	private ServerSocket serverSocket;
	private ExecutorService threadPool;

	/**
	 * 实例化ServerSocket
	 */
	public threadPool(int port) {
		try {
			serverSocket = new ServerSocket(port);
			threadPool = Executors.newFixedThreadPool(10);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
	 * 走线程
	 * 
	 * @author 李文娟
	 *
	 */
	class GetClientMsgHandler implements Runnable {

		private Socket socket;

		/**
		 * @param socket
		 */
		public GetClientMsgHandler(Socket socket) {
			this.socket = socket;
		}

		@Override
		public void run() {
			try {
				while (true) {
					// 输入
					BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "GBK"));
					String request = br.readLine();
					System.out.println("收到客户端信息:\t" + request);
					// 将request给控制中心取处理，并拿到返回值
					ServiceManager sManager = new ServiceManager();
					String response = sManager.getService(request);
					// 输出
					PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
					pw.println(response);
				}
			} catch (IOException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	/**
	 * 测试
	 * @param args
	 */
	public static void main(String[] args) {
		threadPool threadPool = new threadPool(3333);
		threadPool.start();
	}
}
