package carClient.Test;

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
public class client {

	public static void main(String[] args) {
		/*
		 * host: 要请求访问的主机地址:.对于当前来说服务端和客户端都是本机.
		 * 		127.0.0.1  是一个回路IP代表本机.
		 * port: 端口号
		 * 			每一个活动的应用都会占据一个端口号
		 * 当Socket创建成功就代表请求一个服务端成功.
		 * 192.168.2.242
		 */
		try {
			Socket so = new Socket("127.0.0.1", 1024);
			
			//-- 4.获取输出流.写信息给服务端
			OutputStream os = so.getOutputStream();
			//-- 5.装饰成打印流
			PrintWriter pw = new PrintWriter(os, true);
			//-- 6.接收键盘录入的内容
			System.out.println("请输入发送给服务端的信息:");
			Scanner scan = new Scanner(System.in);
			String temp = scan.next();
			//-- 7.把信息发送给服务端
			pw.println(temp);

			//-- 1.获取输入流.用于接收服务端发过来的信息
			InputStream is = so.getInputStream();
			//-- 2.对字节流进行包装得到字符流.再装饰得到缓冲流
			InputStreamReader isr = new InputStreamReader(is,"GBK");
			BufferedReader br = new BufferedReader(isr);
			//-- 3.利用缓冲流API来进行读取
			String line = br.readLine();
			System.out.println("收到服务端信息:\t" + line);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

