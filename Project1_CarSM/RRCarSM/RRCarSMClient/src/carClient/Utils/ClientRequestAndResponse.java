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
public class ClientRequestAndResponse {
	
	public   (String userName, String userPwd) {
		String request = userName+","+userName;
		try {
			// ����server
			Socket so = new Socket("127.0.0.1", 1024);
			// ������ >>> ��ȡserver
			BufferedReader br = new BufferedReader(new InputStreamReader(so.getInputStream(),"GBK"));
			String line = br.readLine();
			System.out.println("�յ��������Ϣ:\t" + line);
			// ����� >>> д��server
			PrintWriter pw = new PrintWriter(so.getOutputStream(), true);
			System.out.println("�����뷢�͸�����˵���Ϣ��");
//			Scanner scan = new Scanner(System.in);
			String temp = request;
			pw.println(temp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
