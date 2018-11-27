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
	 * ʵ����ServerSocket
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
	 * ���������
	 */
	public void start() {
		try {
			// -- ��ѭ���ȴ�����ͻ�������
			while (true) {
				System.out.println("�ȴ��ͻ�������....");
				Socket socket = serverSocket.accept();
				System.out.println("�ͻ�:\t" + socket.getInetAddress() + "\t���ӳɹ�");
				Runnable run = new GetClientMsgHandler(socket);
				threadPool.execute(run);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * ���߳�
	 * 
	 * @author ���ľ�
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
					// ����
					BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "GBK"));
					String request = br.readLine();
					System.out.println("�յ��ͻ�����Ϣ:\t" + request);
					// ��request����������ȡ�������õ�����ֵ
					ServiceManager sManager = new ServiceManager();
					String response = sManager.getService(request);
					// ���
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
	 * ����
	 * @param args
	 */
	public static void main(String[] args) {
		threadPool threadPool = new threadPool(3333);
		threadPool.start();
	}
}
