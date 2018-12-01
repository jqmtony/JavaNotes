package carServer.Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;
import java.text.ParseException;

import carServer.Manager.ServiceManager;

/**
 * ��������ʼ���У������ܿͻ��˵����󣬲��ṩIO������request������response
 * 
 * @author ���ľ�
 *
 */
public class sendClientRequest {
	public static ServerSocket server;
	/**
	 * ����������
	 * @throws SQLException 
	 * @throws ParseException 
	 * 
	 * @throws IOException
	 */
	public void startServer(int port) throws SQLException, ParseException {
		try {
			server = new ServerSocket(port);
			while(true) {
				System.out.println("�����������ɹ�,�ȴ��ͻ��˰�...");
				// ��ȡSocket
				Socket so = server.accept(); 
				System.out.println(so.getInetAddress()+"�����ӵ���������");
				// ����
				BufferedReader br = new BufferedReader(new InputStreamReader(so.getInputStream(), "GBK"));
				String request = br.readLine();
				System.out.println("�յ��ͻ�����Ϣ:\t" + request);
				// ��request����������ȡ���������õ�����ֵ
				ServiceManager sManager = new ServiceManager();
				String response = sManager.getService(request);
				// ���
				PrintWriter pw = new PrintWriter(so.getOutputStream(),true);
				pw.println(response);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * ������
	 * @param args
	 * @throws SQLException
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws SQLException, ParseException {
		sendClientRequest sendClientRequest = new sendClientRequest();
		sendClientRequest.startServer(2222);
	}
}