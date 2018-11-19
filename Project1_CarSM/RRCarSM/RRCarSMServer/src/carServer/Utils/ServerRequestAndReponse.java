package carServer.Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ��������ʼ���У������ܿͻ��˵����󣬲��ṩIO������request������response
 * 
 * @author ���ľ�
 *
 */
public class ServerRequestAndReponse {
	/**
	 * ����������
	 * 
	 * @throws IOException
	 */
	public void startServer(int port) {
		try {
			ServerSocket server = new ServerSocket(1024);
			while(true) {
				System.out.println("�����������ɹ�,�ȴ��ͻ��˰�...");
				// ��ȡSocket
				Socket so = server.accept(); 
				System.out.println(so.getInetAddress().getHostAddress()+"�����ӵ���������");
				// ����� >>> д��Client
				PrintWriter pw = new PrintWriter(so.getOutputStream(),true);
				pw.println("���!");
				// ������ >>> ��ȡClient
				BufferedReader br = new BufferedReader(new InputStreamReader(so.getInputStream(), "GBK"));
				String line = br.readLine();
				System.out.println("�յ��ͻ�����Ϣ:\t" + line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
