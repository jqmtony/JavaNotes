package carServer.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

/**
 * @author Administrator
 *
 */
public class Server {

	
	public static void main(String[] args) {
		//-- 1-65535 ǰ1000��Ҫ��
		try {
			ServerSocket server = new ServerSocket(1024);
			while(true) {
				System.out.println("�����������ɹ�,�ȴ��ͻ��˰�...");
				//-- ���տͻ��˵�����.����ɹ��������Socket����
				Socket so = server.accept(); 
				//-- ����Socket������Դ�ӡ���ʵĿͻ��˵���Ϣ
				System.out.println(so.getInetAddress());
				System.out.println(so.getInetAddress().getHostAddress());
				
				//-- ͨ��Socket��ȡ���������.û��ֱ�ӻ�ȡ�ַ�����APIֻ�ܻ�ȡֱ����
				OutputStream os = so.getOutputStream();
				//-- ���ֽ�������װ�εõ�������.true�����Զ�ˢ��
				PrintWriter pw = new PrintWriter(os,true);
				//-- ������������ͻ��˷�������
				pw.println("���!");
				
				
				//-- ���տͻ��˷��ص���Ϣ
				BufferedReader br = new BufferedReader(new InputStreamReader(so.getInputStream(), "GBK"));
				String line = br.readLine();
				System.out.println("�յ��ͻ�����Ϣ:\t" + line);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

