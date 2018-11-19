package com.server.util;

import java.io.IOException;
import java.net.Socket;
import java.sql.SQLException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerPool {
	/**
	 * �ṩ�̳߳���������ͻ��˵������߳�.����ÿ���½��߳�����ɵ�ϵͳ��Դ�˷�
	 */
	private ExecutorService threadPool;

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
			while (true) {
				Socket socket = ServerSocketFactory.getSocket().accept();
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
		private ServiceFactory serviceFactory;

		/**
		 * �������е�ǰ�ͻ��˷�����߳�
		 * @param socket
		 */
		public ServerClient(Socket socket) {
			serviceFactory= ServiceFactory.getInstance();
			this.socket = socket;
		}
		/**
		 * ��ͻ��˵Ľ���ȫ��
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
					System.out.println("�û�:\t" + socket.getInetAddress() + "\t�Ͽ�����");
					e.printStackTrace();
				}
			}
		}
	}

}
