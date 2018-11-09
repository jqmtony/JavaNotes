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
import java.net.Socket;
import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class ChatClient {

	private Socket clientSocket;

	/**
	 * 
	 */
	public ChatClient(String ipAddress, int port) {
		try {
			clientSocket = new Socket(ipAddress, port);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void inputNickName(Scanner scan) throws IOException {
		String nickName = "";
		PrintWriter pw = new PrintWriter(clientSocket.getOutputStream(), true);
		BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream(), "gbk"));

		while (true) {
			System.out.println("请输入用户名:");
			nickName = scan.nextLine();
			if (nickName.trim().length() == 0 || nickName.trim().equals("")) {
				System.out.println(" 用户名不可以为空");
			} else {
				// -- 把用户名发给服务端
				pw.println(nickName);
				// -- 接收服务端返回的信息
				String result = br.readLine();
				// -- 判断返回的内容
				if (result != null && !result.equalsIgnoreCase("OK")) {
					System.out.println(" 昵称被占用重新输入");
				} else {
					System.out.println("你好\t" + nickName + "可以开始聊天了");
					break;
				}
			}
		}

	}

	/**
	 * 启动客户端
	 */
	public void start() {
		try {
			Scanner scanner = new Scanner(System.in);
			inputNickName(scanner);

			// -- 提供线程专门用于接收服务端发送过来的内容
			Runnable run = new GetServerMsgHandler();
			Thread t = new Thread(run);
			t.start();

			// -- 专门处理发送信息给服务端就可以了
			OutputStream os = clientSocket.getOutputStream();
			PrintWriter pw = new PrintWriter(os, true);
			while (true) {
				pw.println(scanner.nextLine());
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (clientSocket != null) {
				try {
					System.out.println("clientSocket准备关闭");
					clientSocket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	/**
	 * 专门用于收消息
	 * 
	 * @author Administrator
	 *
	 */
	class GetServerMsgHandler implements Runnable {

		@Override
		public void run() {

			try {
				InputStream is = clientSocket.getInputStream();
				InputStreamReader isr = new InputStreamReader(is, "GBK");
				BufferedReader br = new BufferedReader(isr);

				String msgString = "";

				while (null != (msgString = br.readLine())) {
					System.out.println("服务端提示:\t" + msgString);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) {
		ChatClient client = new ChatClient("127.0.0.1", 1234);
		client.start();
	}

}
