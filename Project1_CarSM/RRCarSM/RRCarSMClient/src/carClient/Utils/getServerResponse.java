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

	public String getResponse(String request) throws IOException {
		// ����server
		Socket socket = new Socket("127.0.0.1", 2222);
		// ����� >>> д��server
		PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
		System.out.println("�����뷢�͸�����˵���Ϣ��");
		pw.println(request);
		// ������ >>> ��ȡserver
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "GBK"));
		StringBuffer response = new StringBuffer();
		response.append(br.readLine());
		// �ر�����socket
		pw.close();
		br.close();
		socket.close();
		
		return response.toString();
	}

}
