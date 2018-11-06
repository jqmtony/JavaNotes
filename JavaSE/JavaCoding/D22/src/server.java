
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class server {
	public static void main(String[] args) {
		int count = 0;
		// -- 1-65535 前1000不要用
		try {
			ServerSocket server = new ServerSocket(1024);
			while (true) {
				System.out.println("服务器启动成功,等待客户端绑定...");
				// -- 接收客户端的请求.请求成功后会生成Socket对象
				Socket so = server.accept();
				// -- 利用Socket对象可以打印访问的客户端的信息
				System.out.println("服务器已接受客户端：" + so.getInetAddress());

				// -- 通过Socket获取输出流对象.没有直接获取字符流的API只能获取直接流
					OutputStream os = so.getOutputStream();
					System.out.println("输出流");
					// -- 对字节流进行装饰得到缓冲流.true代表自动刷新
					PrintWriter pw = new PrintWriter(os, true);
					// -- 利用流对象像客户端发送内容
					System.out.println("请输入发送给客户端的信息:");
					Scanner scan = new Scanner(System.in);
					String temp = "你好";
					count = count +1;
					pw.println(temp+"，"+count);

					// -- 接收客户端返回的信息
					BufferedReader br = new BufferedReader(new InputStreamReader(so.getInputStream(), "GBK"));
					String line = br.readLine();
					System.out.println("收到客户端信息:\t" + line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
