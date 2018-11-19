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
public class getServerResponse {

	public String getResponse(String request) throws IOException {
		// 访问server
		Socket socket = new Socket("127.0.0.1", 2222);
		// 输出流 >>> 写给server
		PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
		System.out.println("请输入发送给服务端的信息：");
		pw.println(request);
		// 输入流 >>> 读取server
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "GBK"));
		StringBuffer response = new StringBuffer();
		response.append(br.readLine());
		// 关闭流和socket
		pw.close();
		br.close();
		socket.close();
		
		return response.toString();
	}

}
