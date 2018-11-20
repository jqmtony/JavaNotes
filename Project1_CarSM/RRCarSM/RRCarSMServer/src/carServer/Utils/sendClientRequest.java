package carServer.Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;

import carServer.Manager.ServiceManager;

/**
 * 服务器开始运行，并接受客户端的请求，并提供IO流接受request并返回response
 * 
 * @author 李文娟
 *
 */
public class sendClientRequest {
	public static ServerSocket server;
	/**
	 * 启动服务器
	 * @throws SQLException 
	 * 
	 * @throws IOException
	 */
	public void startServer(int port) throws SQLException {
		try {
			server = new ServerSocket(port);
			while(true) {
				System.out.println("服务器启动成功,等待客户端绑定...");
				// 获取Socket
				Socket so = server.accept(); 
				System.out.println(so.getInetAddress().getHostAddress()+"已连接到服务器！");
				// 输入
				BufferedReader br = new BufferedReader(new InputStreamReader(so.getInputStream(), "GBK"));
				String request = br.readLine();
//				System.out.println("收到客户端信息:\t" + request);
				// 将request给控制中心取处理，并拿到返回值
				ServiceManager sManager = new ServiceManager();
				String response = sManager.getService(request);
				// 输出
				PrintWriter pw = new PrintWriter(so.getOutputStream(),true);
				pw.println(response);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws SQLException {
		sendClientRequest sendClientRequest = new sendClientRequest();
		sendClientRequest.startServer(2222);
	}
}
