
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class client {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/**
		 * 绑定之后输入用户名，正确了再继续，不正确就继续输入
		 */
		HashMap<Integer, String> user = new HashMap<>();
		user.put(1, "123");
		/*
		 * host: 要请求访问的主机地址:.对于当前来说服务端和客户端都是本机. 127.0.0.1 是一个回路IP代表本机. port: 端口号
		 * 每一个活动的应用都会占据一个端口号 当Socket创建成功就代表请求一个服务端成功. 192.168.2.242
		 */
		try {
			while (true) {
				Socket so = new Socket("127.0.0.1", 1024);
				// -- 1.获取输入流.用于接收服务端发过来的信息
				InputStream is = so.getInputStream();
				// -- 2.对字节流进行包装得到字符流.再装饰得到缓冲流
				InputStreamReader isr = new InputStreamReader(is, "GBK");
				BufferedReader br = new BufferedReader(isr);
				// -- 3.利用缓冲流API来进行读取
				String line = br.readLine();
				System.out.println("收到服务端信息:\t" + line);

				// -- 4.获取输出流.写信息给服务端
				OutputStream os = so.getOutputStream();
				// -- 5.装饰成打印流
				PrintWriter pw = new PrintWriter(os, true);
				// -- 6.接收键盘录入的内容
				/**
				 * 用户登录模块
				 */
				while (true) {
					System.out.println("请输入你的用户名称：" + user.get(1));
					if (user.get(1).equals(scan.next())) {
						System.out.println("欢迎登陆");
						break;
					}
				}
				System.out.println("请输入发送给服务端的信息:");
				String temp = scan.next();
				pw.println(temp);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
}
