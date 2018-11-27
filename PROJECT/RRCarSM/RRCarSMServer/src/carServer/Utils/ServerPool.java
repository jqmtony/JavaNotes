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
	 * �ṩ�̳߳���������ͻ��˵������߳�.����ÿ���½��߳�����ɵ�ϵͳ��Դ�˷�
	 */
	private ExecutorService threadPool;
	private ServerSocket serverSocket;
	private Socket socket;
	public ServerPool() {
		threadPool = Executors.newFixedThreadPool(30);
	}

	/**
	 * ���������
	 */
	public void start() {
		System.out.println("�ȴ��ͻ�������....");
		try {
			// -- ��ѭ���ȴ�����ͻ�������
			serverSocket = new ServerSocket(2222);
			while (true) {
				socket = serverSocket.accept();
				System.out.println("�û�:\t" + socket.getInetAddress() + "\t���ӳɹ�");
				Runnable run = new ServerClient(socket);
				threadPool.execute(run);
			}
		} catch (IOException e) {
		}
	}

	/**
	 * `�Ϳͻ��˵��߳�ͨ���ڲ���
	 * 
	 * @author Administrator
	 *
	 */
	class ServerClient implements Runnable {
		/**
		 * ��ǰ�ͻ��˵�����
		 */
		private Socket socket;
		/**
		 * ��ǰ�ͻ��˵ķ���
		 */
		private ServiceManager serviceFactory;

		/**
		 * �������е�ǰ�ͻ��˷�����߳�
		 * @param socket
		 */
		public ServerClient(Socket socket) {
			this.socket = socket;
			serviceFactory = new ServiceManager();
			System.out.println("this.socket = socket"+socket);
		}
		/**
		 * ��ͻ��˵Ľ���ȫ��
		 */
		@Override
		public void run() {
			try {
				while(true) {
					  //���տͻ��˷��ص��ַ���
			        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			        //�����ص��ַ�����װ���ݸ����񹤳�,����ҵ��dao��,Ȼ�󷵻����ɵ��ַ������
			        String request = new String(new StringBuffer(bufferedReader.readLine()));
			        System.out.println(" String request\t"+request);
					String response = serviceFactory.getService(request);
			        
			        // �����ص��ַ������ؿͻ���
			        PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
			        System.out.println("����˴�ӡ�����ص�����"+response);
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
