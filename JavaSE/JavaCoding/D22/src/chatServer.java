import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import org.xml.sax.InputSource;

public class chatServer {
	public static void main(String[] args) {

		try {
			/**
			 * 第一步：开放服务器，接受客户端，拿到地址信息
			 */
			// 服务器自身端口
			ServerSocket server = new ServerSocket(2048);
			// 开始接受客户端的访问
			System.out.println("服务器已开放，等待客户端进入……");
			Socket soClient = server.accept();
			// 欢迎客户端的来访
			System.out.println("客户端：" + soClient.getInetAddress() + "已接入服务器！");
			/**
			 * 第二步：从服务器输出流信息给客户端
			 */
			// 提供输出流，这个是要给客户端的
			OutputStream os = soClient.getOutputStream();
			// 提供一个容器给输出流
			PrintWriter pWriter = new PrintWriter(os, true);
			// 容器有了，那么就放一点东西就行给别人看
			pWriter.println("哈哈，我是服务器，要看到我写了什么的话，客户端你得先有读流的能力啊~");
			/**
			 * 第三步：从客户端读取内容到服务器 —— 如果客户端想要发我点东西看呢？客户端要有写的能力，我也要有读的能力呀！
			 */
			InputStream ipS = soClient.getInputStream();
			InputStreamReader ipsReader = new InputStreamReader(ipS);
			BufferedReader bReader = new BufferedReader(ipsReader);
			String getMsg = "";
			getMsg=bReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// TODO 关机接口
		}

	}
}
