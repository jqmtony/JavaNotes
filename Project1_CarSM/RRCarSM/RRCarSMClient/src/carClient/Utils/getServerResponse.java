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
 * ���ڽ�client�������͸�����ˣ��򽫷���˷��ص���Ϣ���ظ�client
 * 
 * @author ���ľ�
 *
 */
public class getServerResponse {
	public static Socket socket;

	public String getResponse(String request) throws IOException {
		socket = new Socket("127.0.0.1", 2222);
		// ���
		PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
		pw.println(request);
		// ����
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "GBK"));
		String response = new String(new StringBuffer(br.readLine()));
		return response;
	}
}
