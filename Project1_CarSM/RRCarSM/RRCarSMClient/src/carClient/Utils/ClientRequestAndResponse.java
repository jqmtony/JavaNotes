package carClient.Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 用于将client的请求发送给服务端，或将服务端返回的信息返回给client
 * 
 * @author 李文娟
 *
 */
public class ClientRequestAndResponse {
	
	public   (String userName, String userPwd) {
		String request = userName+","+userName;
		try {
			// 访问server
			Socket so = new Socket("127.0.0.1", 1024);
			// 输入流 >>> 读取server
			BufferedReader br = new BufferedReader(new InputStreamReader(so.getInputStream(),"GBK"));
			String line = br.readLine();
			System.out.println("收到服务端信息:\t" + line);
			// 输出流 >>> 写给server
			PrintWriter pw = new PrintWriter(so.getOutputStream(), true);
			System.out.println("请输入发送给服务端的信息：");
//			Scanner scan = new Scanner(System.in);
			String temp = request;
			pw.println(temp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
