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
	public static Socket socket;

	public String getResponse(String request) throws IOException {
		socket = new Socket("127.0.0.1", 2222);
		// 输出
		PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
		pw.println(request);
		// 输入
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "GBK"));
		String response = new String(new StringBuffer(br.readLine()));
		return response;
	}
}
