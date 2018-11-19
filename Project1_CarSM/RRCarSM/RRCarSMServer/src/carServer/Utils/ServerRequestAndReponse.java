package carServer.Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器开始运行，并接受客户端的请求，并提供IO流接受request并返回response
 * 
 * @author 李文娟
 *
 */
public class ServerRequestAndReponse {
	/**
	 * 启动服务器
	 * 
	 * @throws IOException
	 */
	public void startServer(int port) {
		try {
			ServerSocket server = new ServerSocket(1024);
			while(true) {
				System.out.println("服务器启动成功,等待客户端绑定...");
				// 获取Socket
				Socket so = server.accept(); 
				System.out.println(so.getInetAddress().getHostAddress()+"已连接到服务器！");
				// 输出流 >>> 写给Client
				PrintWriter pw = new PrintWriter(so.getOutputStream(),true);
				pw.println("你好!");
				// 输入流 >>> 读取Client
				BufferedReader br = new BufferedReader(new InputStreamReader(so.getInputStream(), "GBK"));
				String line = br.readLine();
				System.out.println("收到客户端信息:\t" + line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
